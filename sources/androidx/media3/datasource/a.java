package androidx.media3.datasource;

import android.util.Base64;
import androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Supplier {
    public final /* synthetic */ int X;

    public /* synthetic */ a(int i2) {
        this.X = i2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.X) {
            case 0:
                Supplier supplier = DataSourceBitmapLoader.f5733a;
                return MoreExecutors.b(Executors.newSingleThreadExecutor());
            case 1:
                byte[] bArr = new byte[12];
                DefaultPlaybackSessionManager.f6004i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                byte[] bArr2 = new byte[12];
                com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.f17226h.nextBytes(bArr2);
                return Base64.encodeToString(bArr2, 10);
            default:
                throw new IllegalStateException();
        }
    }
}
