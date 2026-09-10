package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/dent;", "", X3.a.t, "", "attabal", "(Lkotlinx/coroutines/dent;I)V", "Lwretchedly/dern;", "delegate", "", "undispatched", "wireman", "(Lkotlinx/coroutines/dent;Lwretchedly/dern;Z)V", "marial", "(Lkotlinx/coroutines/dent;)V", "saneness", "(I)Z", "isCancellableMode", "dern", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class permissivist {
    public static final <T> void attabal(dent<? super T> dentVar, int i) {
        wretchedly.dern<? super T> dernVarDern = dentVar.dern();
        boolean z = i == 4;
        if (z || !(dernVarDern instanceof pigboat.competently) || saneness(i) != saneness(dentVar.resumeMode)) {
            wireman(dentVar, dernVarDern, z);
            return;
        }
        pigboat.competently competentlyVar = (pigboat.competently) dernVarDern;
        merc mercVar = competentlyVar.dispatcher;
        CoroutineContext context = competentlyVar.getContext();
        if (pigboat.impromptu.wireman(mercVar, context)) {
            pigboat.impromptu.dern(mercVar, context, dentVar);
        } else {
            marial(dentVar);
        }
    }

    public static final boolean dern(int i) {
        return i == 2;
    }

    public static final void marial(dent<?> dentVar) {
        lerp lerpVarSaneness = basify.f32112attabal.saneness();
        if (lerpVarSaneness.palmyra()) {
            lerpVarSaneness.wostteth(dentVar);
            return;
        }
        lerpVarSaneness.gusty(true);
        try {
            wireman(dentVar, dentVar.dern(), true);
            do {
            } while (lerpVarSaneness.julian());
        } catch (Throwable th) {
            try {
                dentVar.apical(th);
            } finally {
                lerpVarSaneness.czestochowa(true);
            }
        }
    }

    public static final boolean saneness(int i) {
        return i == 1 || i == 2;
    }

    public static final <T> void wireman(dent<? super T> dentVar, wretchedly.dern<? super T> dernVar, boolean z) {
        Object objCutely;
        Object objFormularize = dentVar.formularize();
        Throwable thWireman = dentVar.wireman(objFormularize);
        if (thWireman != null) {
            Result.Companion companion = Result.INSTANCE;
            objCutely = p002kotlin.dern.attabal(thWireman);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objCutely = dentVar.cutely(objFormularize);
        }
        Object objM3351constructorimpl = Result.m3351constructorimpl(objCutely);
        if (!z) {
            dernVar.resumeWith(objM3351constructorimpl);
            return;
        }
        Intrinsics.competently(dernVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        pigboat.competently competentlyVar = (pigboat.competently) dernVar;
        wretchedly.dern<T> dernVar2 = competentlyVar.continuation;
        Object obj = competentlyVar.countOrElement;
        CoroutineContext context = dernVar2.getContext();
        Object objTaiyuan = pigboat.restrictive.taiyuan(context, obj);
        osteal<?> ostealVarImpassible = objTaiyuan != pigboat.restrictive.f35371attabal ? supplicat.impassible(dernVar2, context, objTaiyuan) : null;
        try {
            competentlyVar.continuation.resumeWith(objM3351constructorimpl);
            Unit unit = Unit.f29295attabal;
        } finally {
            if (ostealVarImpassible == null || ostealVarImpassible.prefect()) {
                pigboat.restrictive.beachfront(context, objTaiyuan);
            }
        }
    }
}
