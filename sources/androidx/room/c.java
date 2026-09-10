package androidx.room;

import android.app.Application;
import androidx.room.coroutines.PassthroughConnectionPool;
import com.charging.screenshow.battery.animations.themes.MyApp;
import com.charging.screenshow.battery.animations.themes.activity.MainAct;
import com.charging.screenshow.battery.animations.themes.activity.SplashAct;
import com.charging.screenshow.battery.animations.themes.utils.ActUtils;
import com.charging.screenshow.battery.animations.themes.vm.ImageCategoryVM;
import com.chartboost.sdk.impl.uc;
import com.google.firebase.sessions.UuidGenerator;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.z6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f8277Y;

    public /* synthetic */ c(Object obj, int i2) {
        this.X = i2;
        this.f8277Y = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.f8277Y;
        switch (this.X) {
            case 0:
                SharedSQLiteStatement sharedSQLiteStatement = (SharedSQLiteStatement) obj;
                String strB = sharedSQLiteStatement.b();
                RoomDatabase roomDatabase = sharedSQLiteStatement.f8248a;
                roomDatabase.getClass();
                roomDatabase.a();
                roomDatabase.b();
                return roomDatabase.h().getWritableDatabase().f0(strB);
            case 1:
                PassthroughConnectionPool passthroughConnectionPool = (PassthroughConnectionPool) obj;
                return passthroughConnectionPool.X.open(passthroughConnectionPool.f8294Y);
            case 2:
                boolean z2 = MainAct.q0;
                Application application = ((MainAct) obj).getApplication();
                MyApp myApp = application instanceof MyApp ? (MyApp) application : null;
                if (myApp != null) {
                    return (ImageCategoryVM) myApp.a().a(ImageCategoryVM.class);
                }
                throw new NullPointerException("Application does not inherit from BaseApplication");
            case 3:
                int i2 = SplashAct.q0;
                SplashAct splashAct = (SplashAct) obj;
                ActUtils.b(splashAct, MainAct.class);
                splashAct.finish();
                return Unit.f43263a;
            case 4:
                String string = ((UuidGenerator) obj).next().toString();
                Intrinsics.e(string, "toString(...)");
                return string;
            case 5:
                return z6.a((lb) obj);
            case 6:
                return ArrayIteratorKt.a((Object[]) obj);
            case 7:
                return ((Iterable) obj).iterator();
            case 8:
                return obj;
            case 9:
                return Integer.valueOf(SerialDescriptorImpl._hashCode_delegate$lambda$1((SerialDescriptorImpl) obj));
            default:
                return ((uc) obj).b();
        }
    }
}
