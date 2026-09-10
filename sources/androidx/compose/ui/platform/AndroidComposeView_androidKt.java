package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import com.ironsource.C3414a2;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\".\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lrestrictive/lerp;", C3414a2.d, "", "taiyuan", "([F[F)V", "", "x", "y", "tmpMatrix", "cutely", "([FFF[F)V", "m1", "", "row", "m2", "column", "beachfront", "([FI[FI)F", "Landroid/view/View;", "", "marial", "(Landroid/view/View;Landroid/view/View;)Z", "Lsplinterproof/wireman;", "competently", "(Landroid/view/View;)Lsplinterproof/wireman;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/rotuma;", "attabal", "Lkotlin/jvm/functions/Function1;", "impromptu", "()Lkotlin/jvm/functions/Function1;", "setPlatformTextInputServiceInterceptor", "(Lkotlin/jvm/functions/Function1;)V", "platformTextInputServiceInterceptor", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidComposeView_androidKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static Function1<? super androidx.compose.ui.text.input.rotuma, ? extends androidx.compose.ui.text.input.rotuma> f7236attabal = new Function1<androidx.compose.ui.text.input.rotuma, androidx.compose.ui.text.input.rotuma>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // p002kotlin.jvm.functions.Function1
        public final androidx.compose.ui.text.input.rotuma invoke(androidx.compose.ui.text.input.rotuma rotumaVar) {
            return rotumaVar;
        }
    };

    public static final float beachfront(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    public static final splinterproof.wireman competently(View view) {
        splinterproof.marial.dern(view, 1);
        return splinterproof.marial.saneness(view);
    }

    public static final void cutely(float[] fArr, float f, float f2, float[] fArr2) {
        restrictive.lerp.impromptu(fArr2);
        restrictive.lerp.monoploid(fArr2, f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
        taiyuan(fArr, fArr2);
    }

    public static final Function1<androidx.compose.ui.text.input.rotuma, androidx.compose.ui.text.input.rotuma> impromptu() {
        return f7236attabal;
    }

    public static final boolean marial(View view, View view2) {
        if (Intrinsics.wireman(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final void taiyuan(float[] fArr, float[] fArr2) {
        float fBeachfront = beachfront(fArr2, 0, fArr, 0);
        float fBeachfront2 = beachfront(fArr2, 0, fArr, 1);
        float fBeachfront3 = beachfront(fArr2, 0, fArr, 2);
        float fBeachfront4 = beachfront(fArr2, 0, fArr, 3);
        float fBeachfront5 = beachfront(fArr2, 1, fArr, 0);
        float fBeachfront6 = beachfront(fArr2, 1, fArr, 1);
        float fBeachfront7 = beachfront(fArr2, 1, fArr, 2);
        float fBeachfront8 = beachfront(fArr2, 1, fArr, 3);
        float fBeachfront9 = beachfront(fArr2, 2, fArr, 0);
        float fBeachfront10 = beachfront(fArr2, 2, fArr, 1);
        float fBeachfront11 = beachfront(fArr2, 2, fArr, 2);
        float fBeachfront12 = beachfront(fArr2, 2, fArr, 3);
        float fBeachfront13 = beachfront(fArr2, 3, fArr, 0);
        float fBeachfront14 = beachfront(fArr2, 3, fArr, 1);
        float fBeachfront15 = beachfront(fArr2, 3, fArr, 2);
        float fBeachfront16 = beachfront(fArr2, 3, fArr, 3);
        fArr[0] = fBeachfront;
        fArr[1] = fBeachfront2;
        fArr[2] = fBeachfront3;
        fArr[3] = fBeachfront4;
        fArr[4] = fBeachfront5;
        fArr[5] = fBeachfront6;
        fArr[6] = fBeachfront7;
        fArr[7] = fBeachfront8;
        fArr[8] = fBeachfront9;
        fArr[9] = fBeachfront10;
        fArr[10] = fBeachfront11;
        fArr[11] = fBeachfront12;
        fArr[12] = fBeachfront13;
        fArr[13] = fBeachfront14;
        fArr[14] = fBeachfront15;
        fArr[15] = fBeachfront16;
    }
}
