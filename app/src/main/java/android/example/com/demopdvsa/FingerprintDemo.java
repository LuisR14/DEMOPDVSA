package android.example.com.demopdvsa;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import cn.com.aratek.fp.Bione;
import cn.com.aratek.fp.FingerprintImage;
import cn.com.aratek.fp.FingerprintScanner;
import cn.com.aratek.util.Result;

public class FingerprintDemo extends AppCompatActivity {

    private static final String TAG = "FingerprintDemo";
    private static final int MSG_SHOW_ERROR = 0;
    private static final int MSG_SHOW_INFO = 1;
    private static final int MSG_UPDATE_IMAGE = 2;
    private static final int MSG_UPDATE_TEXT = 3;
    private static final int MSG_UPDATE_BUTTON = 4;
    private static final int MSG_UPDATE_SN = 5;
    private static final int MSG_UPDATE_FW_VERSION = 6;
    private static final int MSG_SHOW_PROGRESS_DIALOG = 7;
    private static final int MSG_DISMISS_PROGRESS_DIALOG = 8;

    private TextView mInformation;
    private TextView mDetails;
    private TextView mSN;
    private TextView mFwVersion;
    private Button mBtnEnroll;
    private Button mBtnVerify;
    private Button mBtnIdentify;
    private Button mBtnClear;
    private Button mBtnShow;
    private EditText mCaptureTime;
    private EditText mExtractTime;
    private EditText mGeneralizeTime;
    private EditText mVerifyTime;
    private ImageView mFingerprintImage;
    private ProgressDialog mProgressDialog;
    private FingerprintScanner mScanner;
    //private FingerprintTask mTask;
    private int mId;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fingerprint_demo);

       //al llamar este metodo y usar una de las librerias externas se genera el crash
        mScanner = FingerprintScanner.getInstance(this);

        mInformation = (TextView) findViewById(R.id.tv_info);
        mDetails = (TextView) findViewById(R.id.tv_details);
        mSN = (TextView) findViewById(R.id.tv_fps_sn);
        mFwVersion = (TextView) findViewById(R.id.tv_fps_fw);
        mCaptureTime = (EditText) findViewById(R.id.captureTime);
        mExtractTime = (EditText) findViewById(R.id.extractTime);
        mGeneralizeTime = (EditText) findViewById(R.id.generalizeTime);
        mVerifyTime = (EditText) findViewById(R.id.verifyTime);
        mFingerprintImage = (ImageView) findViewById(R.id.fingerimage);

        mBtnEnroll = (Button) findViewById(R.id.bt_enroll);
        mBtnVerify = (Button) findViewById(R.id.bt_verify);
        mBtnIdentify = (Button) findViewById(R.id.bt_identify);
        mBtnClear = (Button) findViewById(R.id.bt_clear);
        mBtnShow = (Button) findViewById(R.id.bt_show);

        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressDialog.setIcon(android.R.drawable.ic_dialog_info);
        mProgressDialog.setIndeterminate(false);
        mProgressDialog.setCancelable(false);


    }


}