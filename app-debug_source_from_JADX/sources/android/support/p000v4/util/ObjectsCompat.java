package android.support.p000v4.util;

import android.os.Build;
import android.support.p000v4.graphics.ColorUtils$$ExternalSynthetic0;
import java.util.Arrays;

/* renamed from: android.support.v4.util.ObjectsCompat */
public class ObjectsCompat {
    private ObjectsCompat() {
    }

    public static boolean equals(Object a, Object b) {
        if (Build.VERSION.SDK_INT >= 19) {
            return ColorUtils$$ExternalSynthetic0.m3m0(a, b);
        }
        return a == b || (a != null && a.equals(b));
    }

    public static int hashCode(Object o) {
        if (o != null) {
            return o.hashCode();
        }
        return 0;
    }

    public static int hash(Object... values) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Arrays.hashCode(values);
        }
        return Arrays.hashCode(values);
    }
}
