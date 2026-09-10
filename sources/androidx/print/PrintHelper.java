package androidx.print;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PrintHelper {

    /* JADX INFO: renamed from: androidx.print.PrintHelper$1, reason: invalid class name */
    class AnonymousClass1 extends AsyncTask<Void, Void, Throwable> {
        @Override // android.os.AsyncTask
        public final Throwable doInBackground(Void[] voidArr) {
            throw null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Throwable th) {
            throw null;
        }
    }

    public interface OnPrintFinishCallback {
    }

    public class PrintBitmapAdapter extends PrintDocumentAdapter {
        @Override // android.print.PrintDocumentAdapter
        public final void onFinish() {
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            throw null;
        }
    }

    public class PrintUriAdapter extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bitmap f7895a;

        @Override // android.print.PrintDocumentAdapter
        public final void onFinish() {
            super.onFinish();
            throw null;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0042 */
        @Override // android.print.PrintDocumentAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onLayout(final android.print.PrintAttributes r7, final android.print.PrintAttributes r8, final android.os.CancellationSignal r9, final android.print.PrintDocumentAdapter.LayoutResultCallback r10, android.os.Bundle r11) throws java.lang.Throwable {
            /*
                r6 = this;
                monitor-enter(r6)
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L3d
                boolean r11 = r9.isCanceled()
                if (r11 == 0) goto Lc
                r10.onLayoutCancelled()
                return
            Lc:
                android.graphics.Bitmap r11 = r6.f7895a
                if (r11 == 0) goto L2c
                android.print.PrintDocumentInfo$Builder r9 = new android.print.PrintDocumentInfo$Builder
                r11 = 0
                r9.<init>(r11)
                r11 = 1
                android.print.PrintDocumentInfo$Builder r9 = r9.setContentType(r11)
                android.print.PrintDocumentInfo$Builder r9 = r9.setPageCount(r11)
                android.print.PrintDocumentInfo r9 = r9.build()
                boolean r7 = r8.equals(r7)
                r7 = r7 ^ r11
                r10.onLayoutFinished(r9, r7)
                return
            L2c:
                androidx.print.PrintHelper$PrintUriAdapter$1 r0 = new androidx.print.PrintHelper$PrintUriAdapter$1
                r1 = r6
                r4 = r7
                r3 = r8
                r2 = r9
                r5 = r10
                r0.<init>()
                r7 = 0
                android.net.Uri[] r7 = new android.net.Uri[r7]
                r0.execute(r7)
                return
            L3d:
                r0 = move-exception
                r1 = r6
            L3f:
                r7 = r0
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L42
                throw r7
            L42:
                r0 = move-exception
                goto L3f
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.print.PrintHelper.PrintUriAdapter.onLayout(android.print.PrintAttributes, android.print.PrintAttributes, android.os.CancellationSignal, android.print.PrintDocumentAdapter$LayoutResultCallback, android.os.Bundle):void");
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            throw null;
        }
    }
}
