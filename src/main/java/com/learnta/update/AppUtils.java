package com.learnta.update;

import android.content.Context;
import android.content.pm.PackageManager;

public class AppUtils {

    public static int getVersionCode(Context context) {
        if (null != context) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException ignored) {
            }
        }
        return 0;
    }

    public static String getVersionName(Context context) {
        if (null != context) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException ignored) {
            }
        }
        return "";
    }
}
