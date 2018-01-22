package sda.oscail.edu.actiontabs;

/**
 * Created by keithfinnegan on 1/22/2018.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by keithfinnegan on 12/1/2017.
 */

public class OrderPrescriptionActivity extends AppCompatActivity  {


    static private final String TAG = "ASSIGN 3";

    private String m_To;
    private String m_Instructions;
    ImageView m_View;
    Button m_button;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderfragment);

    }

    /**
     * @return Creates and intent to launch Open mail when button Send order onClicked.
     * @param view Mail opened but no text or picture passed.
     * Citation:
     * Class contains code adapted from URL:http://dcu.adobeconnect.com/sda2
     * Retrieved on: 1st November 2017
     */

    public void sendOrder(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));

        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{m_To});
        intent.putExtra(intent.EXTRA_SUBJECT, m_Instructions);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }

    /**
     * @return Creates and intent to launch Open Camera.
     * @param view ImageView onClick to open camera.
     * Citation:
     * Ref: Camera Icon https://cms-assets.tutsplus.com/uploads/users/33/posts/27136/preview_image/camera-icon-large.png
     * Retrieved on: 4th November 2017
     */

    /**
     * opencamera
     * @param view
     */

    public void openCamera(View view) {
        Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

        /**
         * Unable to open spinner in orderfragment
         * Note: come back to this.
         * OnClick not working for openSpinner when added to orderfragment.xml
         */


    }
    public void openSpinner(View view)
    {
        Intent myIntent = new Intent(this, SpinnerActivity.class);
        startActivity(myIntent);}
}
