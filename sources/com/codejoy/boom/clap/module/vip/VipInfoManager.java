package com.codejoy.boom.clap.module.vip;

import android.content.Context;
import androidx.p001lifecycle.preprohormone;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yoadx.ad.lib.core.YoadAdSdk;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import reuter.rotuma;

/* JADX INFO: compiled from: VipInfoManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002\u001a B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0016R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/codejoy/boom/clap/module/vip/VipInfoManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "cutely", "(Landroid/content/Context;)V", "", "count", "Lkotlin/Function0;", "callback", "molybdenite", "(ILkotlin/jvm/functions/Function0;)V", "", "triweekly", "()Z", "formularize", "arytenoidectomy", "isVipStatusFromServer", "polloi", "(Z)V", "vip", "kowloon", "Landroidx/lifecycle/preprohormone;", "attabal", "Lpatroclinal/taiyuan;", "taiyuan", "()Landroidx/lifecycle/preprohormone;", "vipStateLiveData", "Lmagenta/wireman;", "saneness", "Lmagenta/wireman;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/saran;", "dern", "Lkotlinx/coroutines/saran;", "scope", "Lkotlinx/coroutines/monroe;", "wireman", "Lkotlinx/coroutines/monroe;", "job", "Landroidx/lifecycle/gintrap;", "impromptu", "()Landroidx/lifecycle/gintrap;", "vipState", "marial", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VipInfoManager {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public monroe job;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int f18524beachfront = 8;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan vipStateLiveData = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.vip.monoploid
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VipInfoManager.adultoid();
        }
    });

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public magenta.wireman<Boolean> listener = new magenta.wireman() { // from class: com.codejoy.boom.clap.module.vip.polloi
        @Override // magenta.wireman
        public final void attabal(Object[] objArr) {
            VipInfoManager.impassible(this.f18552attabal, (Boolean[]) objArr);
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public saran scope = privatdozent.attabal(premeiotic.saneness());

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.vip.VipInfoManager$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: VipInfoManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/codejoy/boom/clap/module/vip/VipInfoManager$attabal;", "", "<init>", "()V", "Lcom/codejoy/boom/clap/module/vip/VipInfoManager;", "attabal", "()Lcom/codejoy/boom/clap/module/vip/VipInfoManager;", "", "TAG", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VipInfoManager attabal() {
            return saneness.f18530attabal.attabal();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: VipInfoManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/codejoy/boom/clap/module/vip/VipInfoManager$saneness;", "", "<init>", "()V", "Lcom/codejoy/boom/clap/module/vip/VipInfoManager;", "saneness", "Lcom/codejoy/boom/clap/module/vip/VipInfoManager;", "attabal", "()Lcom/codejoy/boom/clap/module/vip/VipInfoManager;", "INSTANCE", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f18530attabal = new saneness();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static final VipInfoManager INSTANCE = new VipInfoManager();

        public final VipInfoManager attabal() {
            return INSTANCE;
        }
    }

    public static final preprohormone adultoid() {
        return new preprohormone(Boolean.valueOf(babyless.beachfront.marial(tau.saneness.f38666attabal.beachfront(), false)));
    }

    public static final Unit apical() {
        return Unit.f29295attabal;
    }

    public static /* synthetic */ void graveside(VipInfoManager vipInfoManager, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        vipInfoManager.molybdenite(i, function0);
    }

    public static final void impassible(VipInfoManager vipInfoManager, Boolean[] boolArr) {
        Boolean bool = boolArr[0];
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        vipInfoManager.polloi(bool.booleanValue());
    }

    public static final Unit monoploid(VipInfoManager vipInfoManager, boolean z) {
        if (!z) {
            vipInfoManager.polloi(false);
        }
        return Unit.f29295attabal;
    }

    public final void arytenoidectomy() {
        reuter.molybdenite.f36681attabal.coffeecake(new Function1() { // from class: com.codejoy.boom.clap.module.vip.graveside
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VipInfoManager.monoploid(this.f18547kowloon, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void cutely(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        rotuma rotumaVar = rotuma.f36709attabal;
        rotumaVar.impassible(this.listener);
        rotumaVar.dern(context);
        graveside(this, 0, new Function0() { // from class: com.codejoy.boom.clap.module.vip.molybdenite
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VipInfoManager.apical();
            }
        }, 1, null);
    }

    public final void formularize() {
        if (triweekly()) {
            YoadAdSdk.f23874attabal.arytenoidectomy(false);
        } else {
            YoadAdSdk.f23874attabal.arytenoidectomy(true);
        }
    }

    public final androidx.p001lifecycle.gintrap<Boolean> impromptu() {
        return taiyuan();
    }

    public final synchronized void kowloon(boolean vip) {
        tau.saneness sanenessVar = tau.saneness.f38666attabal;
        if (babyless.beachfront.marial(sanenessVar.beachfront(), false) != vip) {
            babyless.beachfront.apical(sanenessVar.beachfront(), Boolean.valueOf(vip));
            taiyuan().apical(Boolean.valueOf(vip));
        }
    }

    public final void molybdenite(int count, Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (count > 1) {
            callback.invoke();
            return;
        }
        monroe monroeVar = this.job;
        if (monroeVar == null || !monroeVar.isActive()) {
            this.job = kotlinx.coroutines.cutely.wireman(this.scope, premeiotic.saneness(), null, new VipInfoManager$updateVipStatusFromServer$1(this, count, callback, null), 2, null);
        }
    }

    public final void polloi(boolean isVipStatusFromServer) {
        if (isVipStatusFromServer) {
            kowloon(true);
            YoadAdSdk.f23874attabal.arytenoidectomy(false);
        } else if (rotuma.f36709attabal.marial() == null) {
            kowloon(false);
            formularize();
        } else {
            kowloon(true);
            YoadAdSdk.f23874attabal.arytenoidectomy(false);
        }
    }

    public final preprohormone<Boolean> taiyuan() {
        return (preprohormone) this.vipStateLiveData.getValue();
    }

    public final boolean triweekly() {
        Boolean boolMarial = impromptu().marial();
        return boolMarial != null ? boolMarial.booleanValue() : babyless.beachfront.marial(tau.saneness.f38666attabal.beachfront(), false);
    }
}
