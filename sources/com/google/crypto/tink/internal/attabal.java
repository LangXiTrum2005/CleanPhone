package com.google.crypto.tink.internal;

import discernable.impromptu;
import discernable.rotuma;
import hobby.privatdozent;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: KeySerializer.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class attabal<KeyT extends impromptu, SerializationT extends privatdozent> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Class<KeyT> f22057attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Class<SerializationT> f22058saneness;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: KeySerializer.java */
    public class C0316attabal extends attabal<KeyT, SerializationT> {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ saneness f22059dern;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0316attabal(Class cls, Class cls2, saneness sanenessVar) {
            super(cls, cls2, null);
            this.f22059dern = sanenessVar;
        }

        @Override // com.google.crypto.tink.internal.attabal
        public SerializationT wireman(KeyT keyt, @Nullable rotuma rotumaVar) throws GeneralSecurityException {
            return (SerializationT) this.f22059dern.attabal(keyt, rotumaVar);
        }
    }

    /* JADX INFO: compiled from: KeySerializer.java */
    public interface saneness<KeyT extends impromptu, SerializationT extends privatdozent> {
        SerializationT attabal(KeyT keyt, @Nullable rotuma rotumaVar) throws GeneralSecurityException;
    }

    public /* synthetic */ attabal(Class cls, Class cls2, C0316attabal c0316attabal) {
        this(cls, cls2);
    }

    public static <KeyT extends impromptu, SerializationT extends privatdozent> attabal<KeyT, SerializationT> attabal(saneness<KeyT, SerializationT> sanenessVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new C0316attabal(cls, cls2, sanenessVar);
    }

    public Class<SerializationT> dern() {
        return this.f22058saneness;
    }

    public Class<KeyT> saneness() {
        return this.f22057attabal;
    }

    public abstract SerializationT wireman(KeyT keyt, @Nullable rotuma rotumaVar) throws GeneralSecurityException;

    public attabal(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f22057attabal = cls;
        this.f22058saneness = cls2;
    }
}
