package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.hardware.SensorManager;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.basic.lib.basic.BasicActivityNotBinding;
import com.basic.lib.basic.BasicFragmentNotBinding;
import com.basic.lib.basic.SafeHandler;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseFragmentWithVM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.dialog.LockHintDialog;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class X9 extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X9(Object obj, int i) {
        super(0);
        this.f = i;
        this.g = obj;
    }

    public final SafeHandler b() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                BasicActivityNotBinding basicActivityNotBinding = (BasicActivityNotBinding) obj;
                return new SafeHandler(basicActivityNotBinding, new W9(basicActivityNotBinding, 0));
            default:
                BasicFragmentNotBinding basicFragmentNotBinding = (BasicFragmentNotBinding) obj;
                AppCompatActivity appCompatActivity = basicFragmentNotBinding.f206a;
                if (appCompatActivity != null) {
                    return new SafeHandler(appCompatActivity, new W9(basicFragmentNotBinding, 1));
                }
                AbstractC2995aW.x0("mActivity");
                throw null;
        }
    }

    public final List c() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 14:
                try {
                    return (List) ((InterfaceC2714Qw) obj).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C2812Uq.f3846a;
                }
            default:
                C3657hz c3657hz = ((KX) obj).e;
                AbstractC2995aW.n(c3657hz);
                List listA = c3657hz.a();
                ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, listA));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() throws ClassNotFoundException {
        Object objValueOf;
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                BaseFragmentWithVM baseFragmentWithVM = (BaseFragmentWithVM) obj;
                return new ViewModelProvider(baseFragmentWithVM).get(baseFragmentWithVM.c());
            case 3:
                View root = ((AbstractC4681tf0) obj).b.getRoot();
                AbstractC2995aW.p(root, "getRoot(...)");
                return root;
            case 4:
                switch (i) {
                    case 4:
                        return new Handler(((SI) obj).b.getMainLooper());
                    default:
                        int i2 = LockHintDialog.g;
                        ((LockHintDialog) obj).getClass();
                        return null;
                }
            case 5:
                switch (i) {
                    case 4:
                        return new Handler(((SI) obj).b.getMainLooper());
                    default:
                        int i3 = LockHintDialog.g;
                        ((LockHintDialog) obj).getClass();
                        return null;
                }
            case 6:
                Object systemService = ((C4370q40) obj).f4867a.getSystemService(com.umeng.analytics.pro.bc.ac);
                AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
                return (SensorManager) systemService;
            case 7:
                Object obj2 = C3850k80.f4589a;
                Context contextF = App.n.f();
                C2856Wi c2856Wi = (C2856Wi) obj;
                String str = c2856Wi.f3934a;
                AbstractC2995aW.q(str, "key");
                Object obj3 = c2856Wi.b;
                AbstractC2995aW.q(obj3, "valueDefault");
                SharedPreferences sharedPreferencesB = C3850k80.b((ContextWrapper) contextF, "SpHelper");
                if (obj3 instanceof Boolean) {
                    objValueOf = Boolean.valueOf(sharedPreferencesB.getBoolean(str, ((Boolean) obj3).booleanValue()));
                } else if (obj3 instanceof String) {
                    objValueOf = sharedPreferencesB.getString(str, (String) obj3);
                } else if (obj3 instanceof Set) {
                    if (!(AbstractC2853Wf.h0((Iterable) obj3) instanceof String)) {
                        throw C3850k80.c(obj3);
                    }
                    objValueOf = sharedPreferencesB.getStringSet(str, (Set) obj3);
                } else if (obj3 instanceof Integer) {
                    objValueOf = Integer.valueOf(sharedPreferencesB.getInt(str, ((Number) obj3).intValue()));
                } else if (obj3 instanceof Long) {
                    objValueOf = Long.valueOf(sharedPreferencesB.getLong(str, ((Number) obj3).longValue()));
                } else {
                    if (!(obj3 instanceof Float)) {
                        throw C3850k80.c(obj3);
                    }
                    objValueOf = Float.valueOf(sharedPreferencesB.getFloat(str, ((Number) obj3).floatValue()));
                }
                AbstractC2995aW.o(objValueOf, "null cannot be cast to non-null type T of com.basic.lib.basic.SpHelper.get");
                c2856Wi.c = true;
                return objValueOf;
            case 8:
                Camera camera = (Camera) ((C3213cv) obj).e.getValue();
                if (camera != null) {
                    return camera.getParameters();
                }
                return null;
            case 9:
                ((C3109bk0) obj).i(true);
                return C5033xf0.f5238a;
            case 10:
                return WD.B((Object[]) obj);
            case 11:
                return obj;
            case 12:
                C3874kV c3874kV = (C3874kV) obj;
                F40 f40I = AbstractC3375el.i("kotlinx.serialization.Polymorphic", C3700iV.f4503a, new D40[0], new C4140nX(c3874kV, 13));
                InterfaceC3156cG interfaceC3156cG = c3874kV.f4600a;
                AbstractC2995aW.q(interfaceC3156cG, com.umeng.analytics.pro.f.X);
                return new C2779Tj(f40I, interfaceC3156cG);
            case 13:
                F40 f40 = (F40) obj;
                return Integer.valueOf(AbstractC2871Wx.i0(f40, f40.k));
            case 14:
                return c();
            default:
                return c();
        }
    }
}
