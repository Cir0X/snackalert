package net.cr0wd.snackalert;

import android.content.res.Resources;
import android.support.design.widget.Snackbar;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SnackAlert {

    /**
     * Shows success Snackbar for short period.
     *
     * @param view    The view to find a parent from.
     * @param message The text to show. Can be formatted text.
     */
    public static void success(View view, String message) {
        createSnackbar(view, message, R.color.success_background, R.color.success_text, Snackbar.LENGTH_SHORT).show();
    }

    /**
     * Shows success Snackbar for short period.
     *
     * @param view    The view to find a parent from.
     * @param message The text resource to show.
     */
    public static void success(View view, int message) {
        createSnackbar(view, message, R.color.success_background, R.color.success_text, Snackbar.LENGTH_SHORT).show();
    }

    /**
     * Shows error Snackbar for short period.
     *
     * @param view    The view to find a parent from.
     * @param message The text to show. Can be formatted text.
     */
    public static void error(View view, String message) {
        createSnackbar(view, message, R.color.error_background, R.color.error_text, Snackbar.LENGTH_SHORT).show();
    }

    /**
     * Shows error Snackbar for short period.
     *
     * @param view    The view to find a parent from.
     * @param message The text resource to show.
     */
    public static void error(View view, int message) {
        createSnackbar(view, message, R.color.error_background, R.color.error_text, Snackbar.LENGTH_SHORT).show();
    }

    /**
     * Shows info Snackbar for short period.
     *
     * @param view    The view to find a parent from.
     * @param message The text to show. Can be formatted text.
     */
    public static void info(View view, String message) {
        createSnackbar(view, message, R.color.info_background, R.color.info_text, Snackbar.LENGTH_SHORT).show();
    }

    /**
     * Shows info Snackbar for short period.
     *
     * @param view    The view to find a parent from.
     * @param message The text resource to show.
     */
    public static void info(View view, int message) {
        createSnackbar(view, message, R.color.info_background, R.color.info_text, Snackbar.LENGTH_SHORT).show();
    }

    /**
     * Shows custom colored Snackbar for short period.
     *
     * @param view            The view to find a parent from.
     * @param message         The text to show. Can be formatted text.
     * @param backgroundColor The color of the background.
     * @param textColor       The color of the text.
     */
    public static void custom(View view, String message, int backgroundColor, int textColor) {
        createCustomSnackbar(view, message, backgroundColor, textColor, Snackbar.LENGTH_SHORT).show();
    }

    /**
     * Shows custom colored Snackbar for short period.
     *
     * @param view            The view to find a parent from.
     * @param message         The text resource to show.
     * @param backgroundColor The color of the background.
     * @param textColor       The color of the text.
     */
    public static void custom(View view, int message, int backgroundColor, int textColor) {
        createCustomSnackbar(view, message, backgroundColor, textColor, Snackbar.LENGTH_SHORT).show();
    }

    /**
     * Shows success Snackbar for long period.
     *
     * @param view    The view to find a parent from.
     * @param message The text to show. Can be formatted text.
     */
    public static void longSuccess(View view, String message) {
        createSnackbar(view, message, R.color.success_background, R.color.success_text, Snackbar.LENGTH_LONG).show();
    }

    /**
     * Shows success Snackbar for long period.
     *
     * @param view    The view to find a parent from.
     * @param message The text resource to show.
     */
    public static void longSuccess(View view, int message) {
        createSnackbar(view, message, R.color.success_background, R.color.success_text, Snackbar.LENGTH_LONG).show();
    }

    /**
     * Shows error Snackbar for long period.
     *
     * @param view    The view to find a parent from.
     * @param message The text to show. Can be formatted text.
     */
    public static void longError(View view, String message) {
        createSnackbar(view, message, R.color.error_background, R.color.error_text, Snackbar.LENGTH_LONG).show();
    }

    /**
     * Shows error Snackbar for long period.
     *
     * @param view    The view to find a parent from.
     * @param message The text resource to show.
     */
    public static void longError(View view, int message) {
        createSnackbar(view, message, R.color.error_background, R.color.error_text, Snackbar.LENGTH_LONG).show();
    }

    /**
     * Shows info Snackbar for long period.
     *
     * @param view    The view to find a parent from.
     * @param message The text to show. Can be formatted text.
     */
    public static void longInfo(View view, String message) {
        createSnackbar(view, message, R.color.info_background, R.color.info_text, Snackbar.LENGTH_LONG).show();
    }

    /**
     * Shows info Snackbar for long period.
     *
     * @param view    The view to find a parent from.
     * @param message The text resource to show.
     */
    public static void longInfo(View view, int message) {
        createSnackbar(view, message, R.color.info_background, R.color.info_text, Snackbar.LENGTH_LONG).show();
    }

    /**
     * Shows custom colored Snackbar for long period.
     *
     * @param view            The view to find a parent from.
     * @param message         The text to show. Can be formatted text.
     * @param backgroundColor The color of the background.
     * @param textColor       The color of the text.
     */
    public static void longCustom(View view, String message, int backgroundColor, int textColor) {
        createCustomSnackbar(view, message, backgroundColor, textColor, Snackbar.LENGTH_LONG).show();
    }

    /**
     * Shows custom colored Snackbar for long period.
     *
     * @param view            The view to find a parent from.
     * @param message         The text resource to show.
     * @param backgroundColor The color of the background.
     * @param textColor       The color of the text.
     */
    public static void longCustom(View view, int message, int backgroundColor, int textColor) {
        createCustomSnackbar(view, message, backgroundColor, textColor, Snackbar.LENGTH_LONG).show();
    }


    private static Snackbar createSnackbar(View view, String message, int backgroundColor, int textColor, int length) {
        Resources res = view.getResources();
        SpannableStringBuilder builder = new SpannableStringBuilder().append(message);
        builder.setSpan(new ForegroundColorSpan(res.getColor(textColor)), 0, message.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        Snackbar snackbar = Snackbar.make(view, builder, length);
        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(res.getColor(backgroundColor));
        return snackbar;
    }

    private static Snackbar createSnackbar(View view, int messageResId, int backgroundColor, int textColor, int length) {
        String message = view.getResources().getString(messageResId);
        return createSnackbar(view, message, backgroundColor, textColor, length);
    }

    private static Snackbar createCustomSnackbar(View view, String message, int backgroundColor, int textColor, int length) {
        SpannableStringBuilder builder = new SpannableStringBuilder().append(message);
        builder.setSpan(new ForegroundColorSpan(textColor), 0, message.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        Snackbar snackbar = Snackbar.make(view, builder, length);
        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(backgroundColor);
        return snackbar;
    }

    private static Snackbar createCustomSnackbar(View view, int messageResId, int backgroundColor, int textColor, int length) {
        String message = view.getResources().getString(messageResId);
        return createCustomSnackbar(view, message, backgroundColor, textColor, length);
    }


}
