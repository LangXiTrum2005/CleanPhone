package groundwood;

import com.google.firebase.encoders.EncodingException;
import derbyshire.competently;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman implements macropsia.saneness<wireman> {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final derbyshire.wireman<Object> f27440marial = new derbyshire.wireman() { // from class: groundwood.attabal
        @Override // derbyshire.saneness
        public final void attabal(Object obj, derbyshire.marial marialVar) {
            wireman.dern(obj, marialVar);
        }
    };

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final derbyshire.beachfront<String> f27437beachfront = new derbyshire.beachfront() { // from class: groundwood.saneness
        @Override // derbyshire.saneness
        public final void attabal(Object obj, competently competentlyVar) throws IOException {
            competentlyVar.attabal((String) obj);
        }
    };

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final derbyshire.beachfront<Boolean> f27438competently = new derbyshire.beachfront() { // from class: groundwood.dern
        @Override // derbyshire.saneness
        public final void attabal(Object obj, competently competentlyVar) throws IOException {
            competentlyVar.competently(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final saneness f27439impromptu = new saneness(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Class<?>, derbyshire.wireman<?>> f27441attabal = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<Class<?>, derbyshire.beachfront<?>> f27443saneness = new HashMap();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public derbyshire.wireman<Object> f27442dern = f27440marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f27444wireman = false;

    /* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
    public class attabal implements derbyshire.attabal {
        public attabal() {
        }

        @Override // derbyshire.attabal
        public void attabal(Object obj, Writer writer) throws IOException {
            marial marialVar = new marial(writer, wireman.this.f27441attabal, wireman.this.f27443saneness, wireman.this.f27442dern, wireman.this.f27444wireman);
            marialVar.apical(obj, false);
            marialVar.adultoid();
        }

        @Override // derbyshire.attabal
        public String saneness(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                attabal(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
    public static final class saneness implements derbyshire.beachfront<Date> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final DateFormat f27446attabal;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f27446attabal = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public saneness() {
        }

        @Override // derbyshire.saneness
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void attabal(Date date, competently competentlyVar) throws IOException {
            competentlyVar.attabal(f27446attabal.format(date));
        }

        public /* synthetic */ saneness(attabal attabalVar) {
            this();
        }
    }

    public wireman() {
        impassible(String.class, f27437beachfront);
        impassible(Boolean.class, f27438competently);
        impassible(Date.class, f27439impromptu);
    }

    public static /* synthetic */ void dern(Object obj, derbyshire.marial marialVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public wireman apical(boolean z) {
        this.f27444wireman = z;
        return this;
    }

    public wireman cutely(macropsia.attabal attabalVar) {
        attabalVar.attabal(this);
        return this;
    }

    @Override // macropsia.saneness
    /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
    public <T> wireman attabal(Class<T> cls, derbyshire.wireman<? super T> wiremanVar) {
        this.f27441attabal.put(cls, wiremanVar);
        this.f27443saneness.remove(cls);
        return this;
    }

    public <T> wireman impassible(Class<T> cls, derbyshire.beachfront<? super T> beachfrontVar) {
        this.f27443saneness.put(cls, beachfrontVar);
        this.f27441attabal.remove(cls);
        return this;
    }

    public derbyshire.attabal taiyuan() {
        return new attabal();
    }
}
