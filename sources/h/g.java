package h;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f42059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i.a f42061d;

    public /* synthetic */ g(h hVar, String str, i.a aVar, int i10) {
        this.f42058a = i10;
        this.f42059b = hVar;
        this.f42060c = str;
        this.f42061d = aVar;
    }

    @Override // h.c
    public final void a(Object obj) {
        switch (this.f42058a) {
            case 0:
                h hVar = this.f42059b;
                ArrayList arrayList = hVar.f42065d;
                LinkedHashMap linkedHashMap = hVar.f42063b;
                String str = this.f42060c;
                Object obj2 = linkedHashMap.get(str);
                i.a aVar = this.f42061d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    hVar.b(iIntValue, aVar, obj);
                    return;
                } catch (Exception e10) {
                    arrayList.remove(str);
                    throw e10;
                }
            default:
                h hVar2 = this.f42059b;
                ArrayList arrayList2 = hVar2.f42065d;
                LinkedHashMap linkedHashMap2 = hVar2.f42063b;
                String str2 = this.f42060c;
                Object obj3 = linkedHashMap2.get(str2);
                i.a aVar2 = this.f42061d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    hVar2.b(iIntValue2, aVar2, obj);
                    return;
                } catch (Exception e11) {
                    arrayList2.remove(str2);
                    throw e11;
                }
        }
    }

    public void b() {
        this.f42059b.f(this.f42060c);
    }
}
