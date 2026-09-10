package com.google.crypto.tink.internal;

import discernable.impromptu;
import discernable.molybdenite;
import discernable.rotuma;
import hobby.impassible;
import hobby.oilcan;
import hobby.privatdozent;
import hobby.yemenite;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: SerializationRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<wireman, com.google.crypto.tink.internal.attabal<?, ?>> f22060attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<wireman, yemenite<?, ?>> f22061dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<C0317dern, impassible<?>> f22062saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Map<C0317dern, oilcan<?>> f22063wireman;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SerializationRegistry.java */
    public static class C0317dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Class<? extends privatdozent> f22064attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final ebullioscopic.attabal f22065saneness;

        public boolean equals(Object obj) {
            if (!(obj instanceof C0317dern)) {
                return false;
            }
            C0317dern c0317dern = (C0317dern) obj;
            return c0317dern.f22064attabal.equals(this.f22064attabal) && c0317dern.f22065saneness.equals(this.f22065saneness);
        }

        public int hashCode() {
            return Objects.hash(this.f22064attabal, this.f22065saneness);
        }

        public String toString() {
            return this.f22064attabal.getSimpleName() + ", object identifier: " + this.f22065saneness;
        }

        public C0317dern(Class<? extends privatdozent> cls, ebullioscopic.attabal attabalVar) {
            this.f22064attabal = cls;
            this.f22065saneness = attabalVar;
        }
    }

    /* JADX INFO: compiled from: SerializationRegistry.java */
    public static class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Class<?> f22070attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Class<? extends privatdozent> f22071saneness;

        public boolean equals(Object obj) {
            if (!(obj instanceof wireman)) {
                return false;
            }
            wireman wiremanVar = (wireman) obj;
            return wiremanVar.f22070attabal.equals(this.f22070attabal) && wiremanVar.f22071saneness.equals(this.f22071saneness);
        }

        public int hashCode() {
            return Objects.hash(this.f22070attabal, this.f22071saneness);
        }

        public String toString() {
            return this.f22070attabal.getSimpleName() + " with serialization type: " + this.f22071saneness.getSimpleName();
        }

        public wireman(Class<?> cls, Class<? extends privatdozent> cls2) {
            this.f22070attabal = cls;
            this.f22071saneness = cls2;
        }
    }

    public <SerializationT extends privatdozent> boolean beachfront(SerializationT serializationt) {
        return this.f22063wireman.containsKey(new C0317dern(serializationt.getClass(), serializationt.attabal()));
    }

    public <SerializationT extends privatdozent> impromptu competently(SerializationT serializationt, @Nullable rotuma rotumaVar) throws GeneralSecurityException {
        C0317dern c0317dern = new C0317dern(serializationt.getClass(), serializationt.attabal());
        if (this.f22062saneness.containsKey(c0317dern)) {
            return this.f22062saneness.get(c0317dern).wireman(serializationt, rotumaVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + c0317dern + " available");
    }

    public <ParametersT extends molybdenite, SerializationT extends privatdozent> SerializationT cutely(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        wireman wiremanVar = new wireman(parameterst.getClass(), cls);
        if (this.f22061dern.containsKey(wiremanVar)) {
            return (SerializationT) this.f22061dern.get(wiremanVar).wireman(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + wiremanVar + " available");
    }

    public <SerializationT extends privatdozent> molybdenite impromptu(SerializationT serializationt) throws GeneralSecurityException {
        C0317dern c0317dern = new C0317dern(serializationt.getClass(), serializationt.attabal());
        if (this.f22063wireman.containsKey(c0317dern)) {
            return this.f22063wireman.get(c0317dern).wireman(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + c0317dern + " available");
    }

    public <SerializationT extends privatdozent> boolean marial(SerializationT serializationt) {
        return this.f22062saneness.containsKey(new C0317dern(serializationt.getClass(), serializationt.attabal()));
    }

    public <KeyT extends impromptu, SerializationT extends privatdozent> SerializationT taiyuan(KeyT keyt, Class<SerializationT> cls, @Nullable rotuma rotumaVar) throws GeneralSecurityException {
        wireman wiremanVar = new wireman(keyt.getClass(), cls);
        if (this.f22060attabal.containsKey(wiremanVar)) {
            return (SerializationT) this.f22060attabal.get(wiremanVar).wireman(keyt, rotumaVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + wiremanVar + " available");
    }

    public dern(saneness sanenessVar) {
        this.f22060attabal = new HashMap(sanenessVar.f22066attabal);
        this.f22062saneness = new HashMap(sanenessVar.f22068saneness);
        this.f22061dern = new HashMap(sanenessVar.f22067dern);
        this.f22063wireman = new HashMap(sanenessVar.f22069wireman);
    }

    /* JADX INFO: compiled from: SerializationRegistry.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Map<wireman, com.google.crypto.tink.internal.attabal<?, ?>> f22066attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Map<wireman, yemenite<?, ?>> f22067dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Map<C0317dern, impassible<?>> f22068saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final Map<C0317dern, oilcan<?>> f22069wireman;

        public saneness() {
            this.f22066attabal = new HashMap();
            this.f22068saneness = new HashMap();
            this.f22067dern = new HashMap();
            this.f22069wireman = new HashMap();
        }

        public <SerializationT extends privatdozent> saneness beachfront(impassible<SerializationT> impassibleVar) throws GeneralSecurityException {
            C0317dern c0317dern = new C0317dern(impassibleVar.dern(), impassibleVar.saneness());
            if (!this.f22068saneness.containsKey(c0317dern)) {
                this.f22068saneness.put(c0317dern, impassibleVar);
                return this;
            }
            impassible<?> impassibleVar2 = this.f22068saneness.get(c0317dern);
            if (impassibleVar2.equals(impassibleVar) && impassibleVar.equals(impassibleVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + c0317dern);
        }

        public <KeyT extends impromptu, SerializationT extends privatdozent> saneness competently(com.google.crypto.tink.internal.attabal<KeyT, SerializationT> attabalVar) throws GeneralSecurityException {
            wireman wiremanVar = new wireman(attabalVar.saneness(), attabalVar.dern());
            if (!this.f22066attabal.containsKey(wiremanVar)) {
                this.f22066attabal.put(wiremanVar, attabalVar);
                return this;
            }
            com.google.crypto.tink.internal.attabal<?, ?> attabalVar2 = this.f22066attabal.get(wiremanVar);
            if (attabalVar2.equals(attabalVar) && attabalVar.equals(attabalVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + wiremanVar);
        }

        public <SerializationT extends privatdozent> saneness impromptu(oilcan<SerializationT> oilcanVar) throws GeneralSecurityException {
            C0317dern c0317dern = new C0317dern(oilcanVar.dern(), oilcanVar.saneness());
            if (!this.f22069wireman.containsKey(c0317dern)) {
                this.f22069wireman.put(c0317dern, oilcanVar);
                return this;
            }
            oilcan<?> oilcanVar2 = this.f22069wireman.get(c0317dern);
            if (oilcanVar2.equals(oilcanVar) && oilcanVar.equals(oilcanVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + c0317dern);
        }

        public dern marial() {
            return new dern(this);
        }

        public <ParametersT extends molybdenite, SerializationT extends privatdozent> saneness taiyuan(yemenite<ParametersT, SerializationT> yemeniteVar) throws GeneralSecurityException {
            wireman wiremanVar = new wireman(yemeniteVar.saneness(), yemeniteVar.dern());
            if (!this.f22067dern.containsKey(wiremanVar)) {
                this.f22067dern.put(wiremanVar, yemeniteVar);
                return this;
            }
            yemenite<?, ?> yemeniteVar2 = this.f22067dern.get(wiremanVar);
            if (yemeniteVar2.equals(yemeniteVar) && yemeniteVar.equals(yemeniteVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + wiremanVar);
        }

        public saneness(dern dernVar) {
            this.f22066attabal = new HashMap(dernVar.f22060attabal);
            this.f22068saneness = new HashMap(dernVar.f22062saneness);
            this.f22067dern = new HashMap(dernVar.f22061dern);
            this.f22069wireman = new HashMap(dernVar.f22063wireman);
        }
    }
}
