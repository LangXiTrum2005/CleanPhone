package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: MapEntryLite.java */
/* JADX INFO: loaded from: classes.dex */
public class supplicat<K, V> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal<K, V> f9864attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final K f9865saneness;
    private final V value;

    /* JADX INFO: compiled from: MapEntryLite.java */
    public static class attabal<K, V> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final WireFormat.FieldType f9866attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final WireFormat.FieldType f9867dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final K f9868saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final V f9869wireman;

        public attabal(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
            this.f9866attabal = fieldType;
            this.f9868saneness = k;
            this.f9867dern = fieldType2;
            this.f9869wireman = v;
        }
    }

    public supplicat(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.f9864attabal = new attabal<>(fieldType, k, fieldType2, v);
        this.f9865saneness = k;
        this.value = v;
    }

    public static <K, V> void marial(CodedOutputStream codedOutputStream, attabal<K, V> attabalVar, K k, V v) throws IOException {
        molybdenite.cuirassed(codedOutputStream, attabalVar.f9866attabal, 1, k);
        molybdenite.cuirassed(codedOutputStream, attabalVar.f9867dern, 2, v);
    }

    public static <K, V> int saneness(attabal<K, V> attabalVar, K k, V v) {
        return molybdenite.wireman(attabalVar.f9866attabal, 1, k) + molybdenite.wireman(attabalVar.f9867dern, 2, v);
    }

    public static <K, V> supplicat<K, V> wireman(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new supplicat<>(fieldType, k, fieldType2, v);
    }

    public int attabal(int i, K k, V v) {
        return CodedOutputStream.splinterproof(i) + CodedOutputStream.oilcan(saneness(this.f9864attabal, k, v));
    }

    public attabal<K, V> dern() {
        return this.f9864attabal;
    }
}
