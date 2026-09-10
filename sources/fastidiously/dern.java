package fastidiously;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b)\u0010*JE\u0010/\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b/\u00100JG\u00101\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010+*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b1\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lfastidiously/dern;", "", "Lbristol/beachfront;", "descriptor", "", "dern", "(Lbristol/beachfront;)V", "", "triweekly", "()Z", "", "impassible", "(Lbristol/beachfront;)I", "oilcan", "index", "rotuma", "(Lbristol/beachfront;I)Z", "", "cord", "(Lbristol/beachfront;I)B", "", "cuirassed", "(Lbristol/beachfront;I)C", "", "preprohormone", "(Lbristol/beachfront;I)S", "yemenite", "(Lbristol/beachfront;I)I", "", "molybdenite", "(Lbristol/beachfront;I)J", "", "cutely", "(Lbristol/beachfront;I)F", "", "marial", "(Lbristol/beachfront;I)D", "", "formularize", "(Lbristol/beachfront;I)Ljava/lang/String;", "Lfastidiously/marial;", "kowloon", "(Lbristol/beachfront;I)Lfastidiously/marial;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/dern;", "deserializer", "previousValue", "supplicat", "(Lbristol/beachfront;ILasosan/dern;Ljava/lang/Object;)Ljava/lang/Object;", "sealless", "Lcerebral/dern;", "attabal", "()Lcerebral/dern;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface dern {

    /* JADX INFO: compiled from: Decoding.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class attabal {
        public static int attabal(dern dernVar, bristol.beachfront descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return -1;
        }

        public static /* synthetic */ Object dern(dern dernVar, bristol.beachfront beachfrontVar, int i, asosan.dern dernVar2, Object obj, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return dernVar.supplicat(beachfrontVar, i, dernVar2, obj);
        }

        public static boolean saneness(dern dernVar) {
            return false;
        }
    }

    cerebral.dern attabal();

    byte cord(bristol.beachfront descriptor, int index);

    char cuirassed(bristol.beachfront descriptor, int index);

    float cutely(bristol.beachfront descriptor, int index);

    void dern(bristol.beachfront descriptor);

    String formularize(bristol.beachfront descriptor, int index);

    int impassible(bristol.beachfront descriptor);

    marial kowloon(bristol.beachfront descriptor, int index);

    double marial(bristol.beachfront descriptor, int index);

    long molybdenite(bristol.beachfront descriptor, int index);

    int oilcan(bristol.beachfront descriptor);

    short preprohormone(bristol.beachfront descriptor, int index);

    boolean rotuma(bristol.beachfront descriptor, int index);

    <T> T sealless(bristol.beachfront descriptor, int index, asosan.dern<? extends T> deserializer, T previousValue);

    <T> T supplicat(bristol.beachfront descriptor, int index, asosan.dern<? extends T> deserializer, T previousValue);

    boolean triweekly();

    int yemenite(bristol.beachfront descriptor, int index);
}
