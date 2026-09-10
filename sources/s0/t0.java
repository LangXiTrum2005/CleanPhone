package s0;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f49908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f49909f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(w0 w0Var, int i10) {
        super(0);
        this.f49908e = i10;
        this.f49909f = w0Var;
    }

    @Override // jk.a
    public final Object invoke() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        switch (this.f49908e) {
            case 0:
                w0 w0Var = this.f49909f;
                File file = new File(w0Var.f49935b.getAbsolutePath() + w0Var.f49938e);
                w0.f(w0Var, file);
                return file;
            case 1:
                System.loadLibrary("datastore_shared_counter");
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new t0(this.f49909f, 0).invoke(), 939524096);
                    try {
                        int fd2 = parcelFileDescriptorOpen.getFd();
                        NativeSharedCounter nativeSharedCounter = b1.f49758b;
                        if (nativeSharedCounter.nativeTruncateFile(fd2) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                        if (jNativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        b1 b1Var = new b1(jNativeCreateSharedCounter);
                        parcelFileDescriptorOpen.close();
                        return b1Var;
                    } catch (Throwable th2) {
                        th = th2;
                        if (parcelFileDescriptorOpen != null) {
                            parcelFileDescriptorOpen.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptorOpen = null;
                }
                break;
            default:
                w0 w0Var2 = this.f49909f;
                File file2 = new File(w0Var2.f49935b.getAbsolutePath() + w0Var2.f49937d);
                w0.f(w0Var2, file2);
                return file2;
        }
    }
}
