package com.learnta.update;

import android.content.Context;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class UpdateAppModule extends ReactContextBaseJavaModule {

    private Context context;

    public UpdateAppModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.context = reactContext;
    }

    @Override
    public String getName() {
        return "UpdateAppModule";
    }

    @Override
    public boolean canOverrideExistingModule() {
        return true;
    }

    @ReactMethod
    public void downloadApk(String downloadUrl) {
        Intent intent = new Intent(context.getApplicationContext(), DownloadService.class);
        intent.putExtra(Constants.APK_DOWNLOAD_URL, downloadUrl);
        context.startService(intent);
    }

}