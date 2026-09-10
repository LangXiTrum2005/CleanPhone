package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f236a = new r() { // from class: com.bykv.vk.openvk.preload.a.b.a.g.1
        @Override // com.bykv.vk.openvk.preload.a.r
        public final <T> q<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.a() == Object.class) {
                return new g(dVar);
            }
            return null;
        }
    };
    private final com.bykv.vk.openvk.preload.a.d b;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.b.a.g$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f237a;

        static {
            int[] iArr = new int[com.bykv.vk.openvk.preload.a.d.b.values().length];
            f237a = iArr;
            try {
                iArr[com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f237a[com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f237a[com.bykv.vk.openvk.preload.a.d.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f237a[com.bykv.vk.openvk.preload.a.d.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f237a[com.bykv.vk.openvk.preload.a.d.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f237a[com.bykv.vk.openvk.preload.a.d.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public g(com.bykv.vk.openvk.preload.a.d dVar) {
        this.b = dVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        switch (AnonymousClass2.f237a[aVar.f().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList.add(a(aVar));
                }
                aVar.b();
                return arrayList;
            case 2:
                com.bykv.vk.openvk.preload.a.b.g gVar = new com.bykv.vk.openvk.preload.a.b.g();
                aVar.c();
                while (aVar.e()) {
                    gVar.put(aVar.g(), a(aVar));
                }
                aVar.d();
                return gVar;
            case 3:
                return aVar.h();
            case 4:
                return Double.valueOf(aVar.k());
            case 5:
                return Boolean.valueOf(aVar.i());
            case 6:
                aVar.j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.h();
            return;
        }
        q qVarA = this.b.a((Class) obj.getClass());
        if (qVarA instanceof g) {
            cVar.f();
            cVar.g();
        } else {
            qVarA.a(cVar, obj);
        }
    }
}
