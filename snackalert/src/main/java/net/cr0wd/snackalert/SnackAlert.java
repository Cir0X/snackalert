package net.cr0wd.snackalert;

import android.content.res.Resources;
import android.support.design.widget.Snackbar;
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
     * Shows error Snackbar for short period.
     *
     * @param view    The view to find a parent from.
     * @param message The text to show. Can be formatted text.
     */
    public static void error(View view, String message) {
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
     * Shows success Snackbar for long period.
     *
     * @param view    The view to find a parent from.
     * @param message The text to show. Can be formatted text.
     */
    public static void longSuccess(View view, String message) {
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
     * Shows info Snackbar for long period.
     *
     * @param view    The view to find a parent from.
     * @param message The text to show. Can be formatted text.
     */
    public static void longInfo(View view, String message) {
        createSnackbar(view, message, R.color.info_background, R.color.info_text, Snackbar.LENGTH_LONG).show();
    }

    private static Snackbar createSnackbar(View view, String message, int backgroundColor, int textColor, int length) {
        Resources res = view.getResources();
        Snackbar snackbar = Snackbar.make(view, message, length);
        ViewGroup viewGroup = (ViewGroup) snackbar.getView();
        viewGroup.setBackgroundColor(res.getColor(backgroundColor));
        TextView textView = (TextView) viewGroup.getChildAt(0);
        textView.setTextColor(res.getColor(textColor));
        return snackbar;
    }

}
