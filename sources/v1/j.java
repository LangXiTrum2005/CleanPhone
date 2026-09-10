package v1;

import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Surface;
import androidx.cardview.widget.CardView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.gms.internal.consent_sdk.x;
import com.google.firebase.components.ComponentRegistrar;
import com.storage.androidcleaner.R;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import y1.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements xi.n, y1.i, y3.a, yf.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static j f52330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static j f52331c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52332a;

    public /* synthetic */ j(int i10) {
        this.f52332a = i10;
    }

    public static MediaCodec c(x xVar) throws IOException {
        String str = ((y1.m) xVar.f23260a).f54127a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    @Override // y3.a
    public CharSequence a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return listPreference.f4668a.getString(R.string.not_set);
        }
        return null;
    }

    @Override // y1.i
    public y1.j d(x xVar) {
        MediaCodec mediaCodecC = null;
        try {
            mediaCodecC = c(xVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) xVar.f23263d;
            mediaCodecC.configure((MediaFormat) xVar.f23261b, surface, (MediaCrypto) xVar.f23264e, (surface == null && ((y1.m) xVar.f23260a).f54134h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecC.start();
            Trace.endSection();
            return new v(mediaCodecC, (y1.h) xVar.f23265f);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodecC != null) {
                mediaCodecC.release();
            }
            throw e10;
        }
    }

    @Override // yf.a
    public void e(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        shortBuffer2.put(shortBuffer);
    }

    public List f(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (tb.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f50673a;
            if (str != null) {
                aVar = new tb.a(str, aVar.f50674b, aVar.f50675c, aVar.f50676d, aVar.f50677e, new tb.n(6, str, aVar), aVar.f50679g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public void g(m5.k kVar, float f10) {
        w.a aVar = (w.a) ((Drawable) kVar.f45902b);
        CardView cardView = (CardView) kVar.f45903c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f10 != aVar.f52726e || aVar.f52727f != useCompatPadding || aVar.f52728g != preventCornerOverlap) {
            aVar.f52726e = f10;
            aVar.f52727f = useCompatPadding;
            aVar.f52728g = preventCornerOverlap;
            aVar.b(null);
            aVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            kVar.G(0, 0, 0, 0);
            return;
        }
        w.a aVar2 = (w.a) ((Drawable) kVar.f45902b);
        float f11 = aVar2.f52726e;
        float f12 = aVar2.f52722a;
        int iCeil = (int) Math.ceil(w.b.a(f11, f12, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(w.b.b(f11, f12, cardView.getPreventCornerOverlap()));
        kVar.G(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // xi.n
    public void onMethodCall(xi.m mVar, xi.o oVar) {
        switch (this.f52332a) {
            case 3:
                ((wi.j) oVar).a(null);
                break;
            default:
                ((wi.j) oVar).a(null);
                break;
        }
    }

    @Override // yf.a
    public int b(int i10) {
        return i10;
    }
}
