package android.support.p000v4.content.p001pm;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: android.support.v4.content.pm.PackageInfoCompat */
public final class PackageInfoCompat {
    public static long getLongVersionCode(PackageInfo info) {
        if (Build.VERSION.SDK_INT >= 28) {
            return info.getLongVersionCode();
        }
        return (long) info.versionCode;
    }

    private PackageInfoCompat() {
    }
}
