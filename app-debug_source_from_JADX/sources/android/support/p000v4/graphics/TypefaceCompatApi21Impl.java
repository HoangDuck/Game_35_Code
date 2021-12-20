package android.support.p000v4.graphics;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* renamed from: android.support.v4.graphics.TypefaceCompatApi21Impl */
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {
    private static final String TAG = "TypefaceCompatApi21Impl";

    TypefaceCompatApi21Impl() {
    }

    private File getFile(ParcelFileDescriptor fd) {
        try {
            String path = Os.readlink("/proc/self/fd/" + fd.getFd());
            if (OsConstants.S_ISREG(Os.stat(path).st_mode)) {
                return new File(path);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface createFromFontInfo(android.content.Context r9, android.os.CancellationSignal r10, android.support.p000v4.provider.FontsContractCompat.FontInfo[] r11, int r12) {
        /*
            r8 = this;
            int r0 = r11.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            android.support.v4.provider.FontsContractCompat$FontInfo r0 = r8.findBestInfo(r11, r12)
            android.content.ContentResolver r2 = r9.getContentResolver()
            android.net.Uri r3 = r0.getUri()     // Catch:{ IOException -> 0x0061 }
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r3 = r2.openFileDescriptor(r3, r4, r10)     // Catch:{ IOException -> 0x0061 }
            java.io.File r4 = r8.getFile(r3)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0031
            boolean r5 = r4.canRead()     // Catch:{ all -> 0x0050 }
            if (r5 != 0) goto L_0x0027
            goto L_0x0031
        L_0x0027:
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r4)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x0030
            r3.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0030:
            return r5
        L_0x0031:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0050 }
            java.io.FileDescriptor r6 = r3.getFileDescriptor()     // Catch:{ all -> 0x0050 }
            r5.<init>(r6)     // Catch:{ all -> 0x0050 }
            android.graphics.Typeface r6 = super.createFromInputStream(r9, r5)     // Catch:{ all -> 0x0047 }
            r5.close()     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x0046
            r3.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0046:
            return r6
        L_0x0047:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r6 = move-exception
            r5.close()     // Catch:{ all -> 0x004e }
            goto L_0x004f
        L_0x004e:
            r7 = move-exception
        L_0x004f:
            throw r6     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r5 = move-exception
            if (r3 == 0) goto L_0x0060
            if (r4 == 0) goto L_0x005d
            r3.close()     // Catch:{ all -> 0x005b }
            goto L_0x0060
        L_0x005b:
            r4 = move-exception
            goto L_0x0060
        L_0x005d:
            r3.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0060:
            throw r5     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            r3 = move-exception
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.graphics.TypefaceCompatApi21Impl.createFromFontInfo(android.content.Context, android.os.CancellationSignal, android.support.v4.provider.FontsContractCompat$FontInfo[], int):android.graphics.Typeface");
    }
}
