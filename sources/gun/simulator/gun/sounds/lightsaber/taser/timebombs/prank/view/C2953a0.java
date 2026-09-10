package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.unity3d.services.ads.token.INativeTokenGeneratorListener;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2953a0 implements InterfaceC3718ih, BI, InterfaceC4269ox, InterfaceC4563sH, InterfaceC3893kh, Continuation, SuccessContinuation, INativeTokenGeneratorListener, IInvocationCallbackInvoker, InterfaceC3212cu, InterfaceC2512Jb, CI, InterfaceC2494Ij, InterfaceC3208cq, InterfaceC3025an, InterfaceC4441qt, InterfaceC3064bC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4103a;

    public /* synthetic */ C2953a0(int i) {
        this.f4103a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3893kh
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2494Ij
    public void accept(Object obj) {
        ((C3031aq) obj).a();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4269ox
    public Object apply(Object obj) {
        switch (this.f4103a) {
            case 0:
                return new C4167nm((InterfaceC2412Ff) obj);
            default:
                return (C3712id0) obj;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CI
    public void b(Object obj, C3125bv c3125bv) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3718ih
    public Object c(C3274de0 c3274de0) {
        switch (this.f4103a) {
            case 0:
                return AbtRegistrar.lambda$getComponents$0(c3274de0);
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f843a.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 4:
                C3157cH c3157cH = ExecutorsRegistrar.f843a;
                return EnumC3802jf0.f4563a;
            case 5:
                return TransportRegistrar.lambda$getComponents$0(c3274de0);
            case 6:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c3274de0);
            case 7:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(c3274de0);
            default:
                Set setJ = c3274de0.j(C3235d8.class);
                C3830jy c3830jy = C3830jy.b;
                if (c3830jy == null) {
                    synchronized (C3830jy.class) {
                        try {
                            c3830jy = C3830jy.b;
                            if (c3830jy == null) {
                                c3830jy = new C3830jy(0);
                                C3830jy.b = c3830jy;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new C3645ho(setJ, c3830jy);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4441qt
    public InterfaceC4177nt[] d(Uri uri, Map map) {
        return h();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3064bC
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4563sH
    public String f(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2512Jb
    public InterfaceC2538Kb g(Bundle bundle) {
        switch (this.f4103a) {
            case 0:
                FW.h(bundle.getInt(AbstractC4843vX.f5134a, -1) == 1);
                float f = bundle.getFloat(C3082bU.d, -1.0f);
                return f == -1.0f ? new C3082bU() : new C3082bU(f);
            case 1:
            case 2:
            case 3:
            case 4:
            case 8:
            case 11:
            default:
                String str = Z6.h;
                int i = bundle.containsKey(str) ? bundle.getInt(str) : 0;
                String str2 = Z6.i;
                int i2 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
                String str3 = Z6.j;
                int i3 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
                String str4 = Z6.k;
                int i4 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
                String str5 = Z6.l;
                return new Z6(i, i2, i3, i4, bundle.containsKey(str5) ? bundle.getInt(str5) : 0);
            case 5:
                int i5 = bundle.getInt(AbstractC4843vX.f5134a, -1);
                if (i5 == 0) {
                    return (AbstractC4843vX) C5150yz.g.g(bundle);
                }
                if (i5 == 1) {
                    return (AbstractC4843vX) C3082bU.e.g(bundle);
                }
                if (i5 == 2) {
                    return (AbstractC4843vX) C4116n90.g.g(bundle);
                }
                if (i5 == 3) {
                    return (AbstractC4843vX) C4060mc0.g.g(bundle);
                }
                throw new IllegalArgumentException(AbstractC3950lJ.p("Unknown RatingType: ", i5));
            case 6:
                String str6 = C4116n90.e;
                FW.h(bundle.getInt(AbstractC4843vX.f5134a, -1) == 2);
                int i6 = bundle.getInt(C4116n90.e, 5);
                float f2 = bundle.getFloat(C4116n90.f, -1.0f);
                return f2 == -1.0f ? new C4116n90(i6) : new C4116n90(i6, f2);
            case 7:
                String str7 = C4060mc0.e;
                FW.h(bundle.getInt(AbstractC4843vX.f5134a, -1) == 3);
                return bundle.getBoolean(C4060mc0.e, false) ? new C4060mc0(bundle.getBoolean(C4060mc0.f, false)) : new C4060mc0();
            case 9:
                int i7 = bundle.getInt(Ec0.h, 0);
                long j = bundle.getLong(Ec0.i, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                long j2 = bundle.getLong(Ec0.j, 0L);
                boolean z = bundle.getBoolean(Ec0.k, false);
                Bundle bundle2 = bundle.getBundle(Ec0.l);
                C2 c2 = bundle2 != null ? (C2) C2.m.g(bundle2) : C2.g;
                Ec0 ec0 = new Ec0();
                ec0.i(null, null, i7, j, j2, c2, z);
                return ec0;
            case 10:
                Bundle bundle3 = bundle.getBundle(Fc0.u);
                C3693iO c3693iO = bundle3 != null ? (C3693iO) C3693iO.m.g(bundle3) : C3693iO.g;
                long j3 = bundle.getLong(Fc0.v, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                long j4 = bundle.getLong(Fc0.w, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                long j5 = bundle.getLong(Fc0.x, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                boolean z2 = bundle.getBoolean(Fc0.y, false);
                boolean z3 = bundle.getBoolean(Fc0.z, false);
                Bundle bundle4 = bundle.getBundle(Fc0.A);
                C3164cO c3164cO = bundle4 != null ? (C3164cO) C3164cO.l.g(bundle4) : null;
                boolean z4 = bundle.getBoolean(Fc0.B, false);
                long j6 = bundle.getLong(Fc0.C, 0L);
                long j7 = bundle.getLong(Fc0.D, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                int i8 = bundle.getInt(Fc0.E, 0);
                int i9 = bundle.getInt(Fc0.F, 0);
                long j8 = bundle.getLong(Fc0.G, 0L);
                Fc0 fc0 = new Fc0();
                fc0.b(Fc0.s, c3693iO, null, j3, j4, j5, z2, z3, c3164cO, j6, j7, i8, i9, j8);
                fc0.l = z4;
                return fc0;
            case 12:
                String str8 = C5029xd0.f;
                C2911Yl c2911Yl = C3974ld0.h;
                Bundle bundle5 = bundle.getBundle(C5029xd0.f);
                bundle5.getClass();
                C3974ld0 c3974ld0 = (C3974ld0) c2911Yl.g(bundle5);
                int[] intArray = bundle.getIntArray(C5029xd0.g);
                int i10 = c3974ld0.f4655a;
                int[] iArr = new int[i10];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(C5029xd0.h);
                boolean[] zArr = new boolean[i10];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new C5029xd0(c3974ld0, bundle.getBoolean(C5029xd0.i, false), intArray, booleanArray);
        }
    }

    public InterfaceC4177nt[] h() {
        return new InterfaceC4177nt[]{new PP()};
    }

    public Constructor i() {
        switch (this.f4103a) {
            case 19:
                int[] iArr = C3114bn.b;
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC4177nt.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                int[] iArr2 = C3114bn.b;
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(InterfaceC4177nt.class).getConstructor(new Class[0]);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public void invoke(Object obj) {
        InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj;
        switch (this.f4103a) {
            case 0:
                interfaceC3579h4.getClass();
                break;
            default:
                interfaceC3579h4.getClass();
                break;
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
    public void invokeCallback(Invocation invocation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
    public void onReady(String str) {
        InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3212cu
    public ObjectInputStream provideObjectInputStream(InputStream inputStream) {
        return C3300du.m234objectInputStreamProvider$lambda0(inputStream);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i;
        switch (this.f4103a) {
            case 3:
                Object obj = C2478Ht.c;
                i = 403;
                break;
            default:
                Object obj2 = C2478Ht.c;
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3208cq
    public void e() {
    }
}
