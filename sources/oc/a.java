package oc;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47363a;

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        switch (this.f47363a) {
            case 0:
                throw new mc.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                mc.e eVar = (mc.e) obj2;
                eVar.a(pc.f.f48312g, entry.getKey());
                eVar.a(pc.f.f48313h, entry.getValue());
                return;
            default:
                throw new mc.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
