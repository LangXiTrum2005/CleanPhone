package qi;

import am.e;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.google.android.gms.internal.ads.y2;
import j1.f;
import java.nio.ByteBuffer;
import ni.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f49024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(h hVar, int i10) {
        super(hVar, 29);
        this.f49024c = i10;
    }

    @Override // am.e
    public final Bitmap x(ByteBuffer byteBuffer, y2 y2Var) {
        switch (this.f49024c) {
            case 0:
                Bitmap bitmapX = super.x(byteBuffer, y2Var);
                if (bitmapX != null) {
                    return bitmapX;
                }
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining, options);
                if (y2Var.f22085d == 0) {
                    return f.b(bitmapDecodeByteArray, y2Var.f22086e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(y2Var.f22085d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                bitmapDecodeByteArray.recycle();
                return f.b(bitmapCreateBitmap, y2Var.f22086e);
            default:
                return f.b(super.x(byteBuffer, y2Var), y2Var.f22086e);
        }
    }
}
