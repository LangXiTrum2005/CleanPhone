package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ZF implements InterfaceC3609hS, InterfaceC3280dh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4061a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final InterfaceC3521gS e;
    public final boolean f;

    public ZF(BufferedWriter bufferedWriter, HashMap map, HashMap map2, C3420fF c3420fF, boolean z) {
        this.b = new JsonWriter(bufferedWriter);
        this.c = map;
        this.d = map2;
        this.e = c3420fF;
        this.f = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3609hS
    public final InterfaceC3609hS a(C2530Jt c2530Jt, int i) throws IOException {
        String str = c2530Jt.f3287a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3609hS
    public final InterfaceC3609hS b(C2530Jt c2530Jt, long j) throws IOException {
        String str = c2530Jt.f3287a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3609hS
    public final InterfaceC3609hS c(C2530Jt c2530Jt, Object obj) throws IOException {
        g(obj, c2530Jt.f3287a);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3280dh0
    public final InterfaceC3280dh0 d(String str) throws IOException {
        h();
        this.b.value(str);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3280dh0
    public final InterfaceC3280dh0 e(boolean z) throws IOException {
        h();
        this.b.value(z);
        return this;
    }

    public final ZF f(Object obj) {
        int i = 0;
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new C3823jr(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC3521gS interfaceC3521gS = (InterfaceC3521gS) this.c.get(obj.getClass());
            if (interfaceC3521gS != null) {
                jsonWriter.beginObject();
                interfaceC3521gS.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC3191ch0 interfaceC3191ch0 = (InterfaceC3191ch0) this.d.get(obj.getClass());
            if (interfaceC3191ch0 != null) {
                interfaceC3191ch0.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                h();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                h();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                f(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                f(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final ZF g(Object obj, String str) throws IOException {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj != null) {
                h();
                jsonWriter.name(str);
                f(obj);
            }
            return this;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            f(obj);
        }
        return this;
    }

    public final void h() {
        if (!this.f4061a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
