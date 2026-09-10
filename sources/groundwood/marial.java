package groundwood;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import derbyshire.competently;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: JsonValueObjectEncoderContext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class marial implements derbyshire.marial, competently {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final derbyshire.wireman<Object> f27431beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f27432competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final JsonWriter f27433dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Map<Class<?>, derbyshire.beachfront<?>> f27434marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Map<Class<?>, derbyshire.wireman<?>> f27436wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public marial f27430attabal = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f27435saneness = true;

    public marial(Writer writer, Map<Class<?>, derbyshire.wireman<?>> map, Map<Class<?>, derbyshire.beachfront<?>> map2, derbyshire.wireman<Object> wiremanVar, boolean z) {
        this.f27433dern = new JsonWriter(writer);
        this.f27436wireman = map;
        this.f27434marial = map2;
        this.f27431beachfront = wiremanVar;
        this.f27432competently = z;
    }

    public void adultoid() throws IOException {
        preprohormone();
        this.f27433dern.flush();
    }

    public marial apical(Object obj, boolean z) throws IOException {
        if (z && graveside(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f27433dern.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f27433dern.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f27433dern.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    apical(it.next(), false);
                }
                this.f27433dern.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f27433dern.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        arytenoidectomy((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.f27433dern.endObject();
                return this;
            }
            derbyshire.wireman<?> wiremanVar = this.f27436wireman.get(obj.getClass());
            if (wiremanVar != null) {
                return dovishness(wiremanVar, obj, z);
            }
            derbyshire.beachfront<?> beachfrontVar = this.f27434marial.get(obj.getClass());
            if (beachfrontVar != null) {
                beachfrontVar.attabal(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return dovishness(this.f27431beachfront, obj, z);
            }
            if (obj instanceof beachfront) {
                taiyuan(((beachfront) obj).getNumber());
                return this;
            }
            attabal(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return molybdenite((byte[]) obj);
        }
        this.f27433dern.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                this.f27433dern.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                cutely(jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.f27433dern.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.f27433dern.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                apical(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                apical(obj2, false);
            }
        }
        this.f27433dern.endArray();
        return this;
    }

    public marial arytenoidectomy(String str, Object obj) throws IOException {
        return this.f27432competently ? rotuma(str, obj) : gintrap(str, obj);
    }

    @Override // derbyshire.marial
    public derbyshire.marial beachfront(derbyshire.dern dernVar, Object obj) throws IOException {
        return arytenoidectomy(dernVar.saneness(), obj);
    }

    public marial cutely(long j) throws IOException {
        preprohormone();
        this.f27433dern.value(j);
        return this;
    }

    @Override // derbyshire.marial
    public derbyshire.marial dern(derbyshire.dern dernVar, int i) throws IOException {
        return triweekly(dernVar.saneness(), i);
    }

    public marial dovishness(derbyshire.wireman<Object> wiremanVar, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f27433dern.beginObject();
        }
        wiremanVar.attabal(obj, this);
        if (!z) {
            this.f27433dern.endObject();
        }
        return this;
    }

    @Override // derbyshire.competently
    /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
    public marial attabal(String str) throws IOException {
        preprohormone();
        this.f27433dern.value(str);
        return this;
    }

    public final marial gintrap(String str, Object obj) throws EncodingException, IOException {
        preprohormone();
        this.f27433dern.name(str);
        if (obj != null) {
            return apical(obj, false);
        }
        this.f27433dern.nullValue();
        return this;
    }

    public final boolean graveside(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public marial impassible(String str, double d) throws IOException {
        preprohormone();
        this.f27433dern.name(str);
        return impromptu(d);
    }

    public marial impromptu(double d) throws IOException {
        preprohormone();
        this.f27433dern.value(d);
        return this;
    }

    public marial kowloon(String str, long j) throws IOException {
        preprohormone();
        this.f27433dern.name(str);
        return cutely(j);
    }

    @Override // derbyshire.marial
    public derbyshire.marial marial(derbyshire.dern dernVar, double d) throws IOException {
        return impassible(dernVar.saneness(), d);
    }

    public marial molybdenite(byte[] bArr) throws IOException {
        preprohormone();
        if (bArr == null) {
            this.f27433dern.nullValue();
            return this;
        }
        this.f27433dern.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public marial monoploid(String str, boolean z) throws IOException {
        preprohormone();
        this.f27433dern.name(str);
        return competently(z);
    }

    @Override // derbyshire.competently
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public marial competently(boolean z) throws IOException {
        preprohormone();
        this.f27433dern.value(z);
        return this;
    }

    public final void preprohormone() throws IOException {
        if (!this.f27435saneness) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        marial marialVar = this.f27430attabal;
        if (marialVar != null) {
            marialVar.preprohormone();
            this.f27430attabal.f27435saneness = false;
            this.f27430attabal = null;
            this.f27433dern.endObject();
        }
    }

    public final marial rotuma(String str, Object obj) throws EncodingException, IOException {
        if (obj == null) {
            return this;
        }
        preprohormone();
        this.f27433dern.name(str);
        return apical(obj, false);
    }

    @Override // derbyshire.marial
    public derbyshire.marial saneness(derbyshire.dern dernVar, boolean z) throws IOException {
        return monoploid(dernVar.saneness(), z);
    }

    public marial taiyuan(int i) throws IOException {
        preprohormone();
        this.f27433dern.value(i);
        return this;
    }

    public marial triweekly(String str, int i) throws IOException {
        preprohormone();
        this.f27433dern.name(str);
        return taiyuan(i);
    }

    @Override // derbyshire.marial
    public derbyshire.marial wireman(derbyshire.dern dernVar, long j) throws IOException {
        return kowloon(dernVar.saneness(), j);
    }
}
