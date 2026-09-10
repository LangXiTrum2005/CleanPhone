package i0;

import android.app.LocaleManager;
import android.window.OnBackInvokedDispatcher;
import com.facebook.appevents.AppEventsManager;
import com.google.firebase.datatransport.TransportRegistrar;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import l1.g;
import l7.m0;
import l7.s;
import n2.k;
import n2.n;
import nd.f0;
import q7.m;
import q7.p;
import r1.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements n, g, tb.d, m, o8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42484a;

    public /* synthetic */ a(int i10) {
        this.f42484a = i10;
    }

    public static /* bridge */ /* synthetic */ LocaleManager b(Object obj) {
        return (LocaleManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return LocaleManager.class;
    }

    public Constructor a() {
        switch (this.f42484a) {
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(k.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(k.class).getConstructor(null);
        }
    }

    @Override // l1.g
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // o8.e
    public Object apply(Object obj) {
        return ((f0) obj).toByteArray();
    }

    @Override // q7.m
    public void c(boolean z10) {
        switch (this.f42484a) {
            case 12:
                if (z10 && m0.c()) {
                    p.a(new q(6), q7.n.CrashReport);
                    p.a(new q(7), q7.n.ErrorReport);
                    p.a(new q(8), q7.n.AnrReport);
                    break;
                }
                break;
            case 13:
                if (z10) {
                    AppEventsManager.start();
                }
                break;
            case 14:
                if (z10) {
                    s.f45223m = true;
                }
                break;
            case 15:
                if (z10) {
                    s.f45224n = true;
                }
                break;
            default:
                if (z10) {
                    s.f45225o = true;
                }
                break;
        }
    }

    @Override // n2.n
    public k[] createExtractors() {
        return new k[]{new i3.c()};
    }

    @Override // tb.d
    public Object g(tb.s sVar) {
        switch (this.f42484a) {
            case 8:
                return TransportRegistrar.lambda$getComponents$0(sVar);
            case 9:
                return TransportRegistrar.lambda$getComponents$1(sVar);
            default:
                return TransportRegistrar.lambda$getComponents$2(sVar);
        }
    }
}
