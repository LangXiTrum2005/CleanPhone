package com.codejoy.boom.clap.module.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.cig;
import androidx.p000activity.polloi;
import androidx.p001lifecycle.cord;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.module.vip.VipInfoManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.yoadx.ad.lib.core.YoadAdSdk;
import goonda.attabal;
import java.util.Stack;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.apical;
import patroclinal.beachfront;

/* JADX INFO: compiled from: BaseActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u0000 \u001f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0000H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH&¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\bH&¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0018\u0010\u0005R\"\u0010\u001e\u001a\u00028\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lgoonda/attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/content/Context;", "newBase", "", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Ljava/lang/Class;", "Landroid/app/Activity;", "activityClass", "seminary", "(Ljava/lang/Class;)V", "starveling", "()Lgoonda/attabal;", "privatdozent", "saran", "onDestroy", "dovishness", "Lgoonda/attabal;", "grimness", "hydrovane", "(Lgoonda/attabal;)V", "binding", "gintrap", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseActivity<T extends attabal> extends AppCompatActivity {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public T binding;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public static final int f18278rotuma = 8;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final Stack<Activity> f18277preprohormone = new Stack<>();

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.base.BaseActivity$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: BaseActivity.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/codejoy/boom/clap/module/base/BaseActivity$attabal;", "", "<init>", "()V", "Ljava/util/Stack;", "Landroid/app/Activity;", "activityStacks", "Ljava/util/Stack;", "attabal", "()Ljava/util/Stack;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Stack<Activity> attabal() {
            return BaseActivity.f18277preprohormone;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: BaseActivity.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class saneness implements cord, apical {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Function1 f18280kowloon;

        public saneness(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f18280kowloon = function;
        }

        @Override // androidx.p001lifecycle.cord
        public final /* synthetic */ void attabal(Object obj) {
            this.f18280kowloon.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof cord) && (obj instanceof apical)) {
                return Intrinsics.wireman(getFunctionDelegate(), ((apical) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p002kotlin.jvm.internal.apical
        public final beachfront<?> getFunctionDelegate() {
            return this.f18280kowloon;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit creditor(BaseActivity baseActivity, Boolean bool) {
        Intrinsics.competently(baseActivity, "null cannot be cast to non-null type com.codejoy.boom.clap.module.base.AdViewHolder");
        for (View view : ((holophone.attabal) baseActivity).saneness()) {
            if (!YoadAdSdk.f23874attabal.competently() || bool.booleanValue()) {
                view.setVisibility(8);
            }
        }
        return Unit.f29295attabal;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        super.attachBaseContext(jugal.attabal.f29013attabal.attabal(newBase));
    }

    public final T grimness() {
        T t = this.binding;
        if (t != null) {
            return t;
        }
        Intrinsics.preprohormone("binding");
        return null;
    }

    public final void hydrovane(T t) {
        Intrinsics.checkNotNullParameter(t, "<set-?>");
        this.binding = t;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p000activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        polloi.saneness(this, null, null, 3, null);
        hydrovane(starveling());
        setContentView(grimness().getRoot());
        new cig(getWindow(), getWindow().getDecorView()).wireman(false);
        if (this instanceof holophone.attabal) {
            VipInfoManager.INSTANCE.attabal().impromptu().competently(this, new saneness(new Function1() { // from class: holophone.saneness
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseActivity.creditor(this.f27874kowloon, (Boolean) obj);
                }
            }));
        }
        f18277preprohormone.push(this);
        privatdozent();
        saran();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m3351constructorimpl(Boolean.valueOf(f18277preprohormone.remove(this)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(dern.attabal(th));
        }
    }

    public abstract void privatdozent();

    public abstract void saran();

    public final void seminary(Class<? extends Activity> activityClass) {
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        try {
            Result.Companion companion = Result.INSTANCE;
            for (Activity activity : f18277preprohormone) {
                if (!Intrinsics.wireman(activity, this) && Intrinsics.wireman(activity.getClass(), activityClass)) {
                    activity.finish();
                }
            }
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(dern.attabal(th));
        }
    }

    public abstract T starveling();
}
