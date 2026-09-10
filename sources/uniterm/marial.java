package uniterm;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ProtobufEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Class<?>, derbyshire.wireman<?>> f39234attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final derbyshire.wireman<Object> f39235dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<Class<?>, derbyshire.beachfront<?>> f39236saneness;

    /* JADX INFO: compiled from: ProtobufEncoder.java */
    public static final class attabal implements macropsia.saneness<attabal> {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final derbyshire.wireman<Object> f39237wireman = new derbyshire.wireman() { // from class: uniterm.wireman
            @Override // derbyshire.saneness
            public final void attabal(Object obj, derbyshire.marial marialVar) {
                marial.attabal.saneness(obj, marialVar);
            }
        };

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Map<Class<?>, derbyshire.wireman<?>> f39238attabal = new HashMap();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Map<Class<?>, derbyshire.beachfront<?>> f39240saneness = new HashMap();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public derbyshire.wireman<Object> f39239dern = f39237wireman;

        public static /* synthetic */ void saneness(Object obj, derbyshire.marial marialVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public marial dern() {
            return new marial(new HashMap(this.f39238attabal), new HashMap(this.f39240saneness), this.f39239dern);
        }

        @Override // macropsia.saneness
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public <U> attabal attabal(Class<U> cls, derbyshire.wireman<? super U> wiremanVar) {
            this.f39238attabal.put(cls, wiremanVar);
            this.f39240saneness.remove(cls);
            return this;
        }

        public attabal wireman(macropsia.attabal attabalVar) {
            attabalVar.attabal(this);
            return this;
        }
    }

    public marial(Map<Class<?>, derbyshire.wireman<?>> map, Map<Class<?>, derbyshire.beachfront<?>> map2, derbyshire.wireman<Object> wiremanVar) {
        this.f39234attabal = map;
        this.f39236saneness = map2;
        this.f39235dern = wiremanVar;
    }

    public static attabal attabal() {
        return new attabal();
    }

    public byte[] dern(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            saneness(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void saneness(Object obj, OutputStream outputStream) throws IOException {
        new com.google.firebase.encoders.proto.saneness(outputStream, this.f39234attabal, this.f39236saneness, this.f39235dern).graveside(obj);
    }
}
