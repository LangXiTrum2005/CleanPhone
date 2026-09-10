package r5;

import android.util.Log;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import go.c;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import wi.j;
import wj.f;
import xi.m;
import xi.n;
import xi.o;
import xi.p;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lr5/a;", "Lti/b;", "Lxi/n;", "<init>", "()V", "rive_native_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements ti.b, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f49405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f49406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f49407c = new LinkedHashMap();

    static {
        System.loadLibrary("rive_native");
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a flutterPluginBinding) {
        kotlin.jvm.internal.n.f(flutterPluginBinding, "flutterPluginBinding");
        p pVar = new p(flutterPluginBinding.f50789c, "rive_native");
        this.f49405a = pVar;
        pVar.b(this);
        h hVar = flutterPluginBinding.f50790d;
        kotlin.jvm.internal.n.e(hVar, "getTextureRegistry(...)");
        this.f49406b = hVar;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        LinkedHashMap linkedHashMap = this.f49407c;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).c();
        }
        linkedHashMap.clear();
        p pVar = this.f49405a;
        if (pVar != null) {
            pVar.b(null);
        } else {
            kotlin.jvm.internal.n.l("channel");
            throw null;
        }
    }

    @Override // xi.n
    public final void onMethodCall(m call, o oVar) {
        kotlin.jvm.internal.n.f(call, "call");
        String str = call.f53822a;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1057393789) {
                LinkedHashMap linkedHashMap = this.f49407c;
                if (iHashCode != -222324745) {
                    if (iHashCode == 828700799 && str.equals("createTexture")) {
                        Integer num = (Integer) call.a("width");
                        Integer num2 = (Integer) call.a("height");
                        if (num == null || num2 == null) {
                            ((j) oVar).b("CreateTexture Error", "Width and height are required", null);
                            return;
                        }
                        h hVar = this.f49406b;
                        if (hVar == null) {
                            kotlin.jvm.internal.n.l("textureRegistry");
                            throw null;
                        }
                        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerA = hVar.a(1);
                        b bVar = new b(textureRegistry$SurfaceProducerA, num.intValue(), num2.intValue());
                        linkedHashMap.put(Long.valueOf(textureRegistry$SurfaceProducerA.id()), bVar);
                        f fVar = new f("textureId", Long.valueOf(textureRegistry$SurfaceProducerA.id()));
                        long j10 = bVar.f49410d;
                        c.b(16);
                        String string = Long.toString(j10, 16);
                        kotlin.jvm.internal.n.e(string, "toString(...)");
                        ((j) oVar).a(b0.Q(fVar, new f("renderer", string)));
                        return;
                    }
                } else if (str.equals("removeTexture")) {
                    Integer num3 = (Integer) call.a("id");
                    Long lValueOf = num3 != null ? Long.valueOf(num3.intValue()) : null;
                    if (lValueOf == null) {
                        ((j) oVar).b("removeTexture Error", "Texture ID is required", null);
                        return;
                    }
                    b bVar2 = (b) linkedHashMap.get(lValueOf);
                    if (bVar2 != null) {
                        bVar2.c();
                        linkedHashMap.remove(lValueOf);
                        ((j) oVar).a(null);
                        return;
                    } else {
                        Log.e("RiveNativePlugin", "removeTexture: texture " + lValueOf + " not found");
                        ((j) oVar).b("removeTexture Error", "Texture not found", null);
                        return;
                    }
                }
            } else if (str.equals("getRenderContext")) {
                ((j) oVar).a(b0.P(new f("rendererContext", "android")));
                return;
            }
        }
        ((j) oVar).c();
    }
}
