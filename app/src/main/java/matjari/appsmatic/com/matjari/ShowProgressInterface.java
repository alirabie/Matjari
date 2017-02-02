package matjari.appsmatic.com.matjari;

import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.ProgressBar;

/**
 * Created by Mido PC on 2/2/2017.
 */
public class ShowProgressInterface {

    ProgressBar progressBar;


    ShowProgressInterface(ProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    @JavascriptInterface
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @JavascriptInterface
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }
}
