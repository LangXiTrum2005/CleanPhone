package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import endosteum.formularize;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: Engine.java */
/* JADX INFO: loaded from: classes2.dex */
public class beachfront implements endosteum.wireman, hemolysin.impromptu.attabal, impromptu.attabal {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final boolean f17686taiyuan = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final endosteum.impromptu f17687attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final dern f17688beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final attabal f17689competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final hemolysin.impromptu f17690dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.attabal f17691impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final formularize f17692marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final endosteum.beachfront f17693saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final saneness f17694wireman;

    /* JADX INFO: compiled from: Engine.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final DecodeJob.marial f17695attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f17696dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final technofreak.competently<DecodeJob<?>> f17697saneness = naming.attabal.wireman(Opcodes.FCMPG, new C0177attabal());

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.beachfront$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Engine.java */
        public class C0177attabal implements naming.attabal.wireman<DecodeJob<?>> {
            public C0177attabal() {
            }

            @Override // naming.attabal.wireman
            /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
            public DecodeJob<?> attabal() {
                attabal attabalVar = attabal.this;
                return new DecodeJob<>(attabalVar.f17695attabal, attabalVar.f17697saneness);
            }
        }

        public attabal(DecodeJob.marial marialVar) {
            this.f17695attabal = marialVar;
        }

        public <R> DecodeJob<R> attabal(com.bumptech.glide.wireman wiremanVar, Object obj, endosteum.marial marialVar, maggot.saneness sanenessVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, endosteum.dern dernVar, Map<Class<?>, maggot.competently<?>> map, boolean z, boolean z2, boolean z3, maggot.wireman wiremanVar2, DecodeJob.saneness<R> sanenessVar2) {
            DecodeJob decodeJob = (DecodeJob) com.bumptech.glide.util.apical.wireman(this.f17697saneness.saneness());
            int i3 = this.f17696dern;
            this.f17696dern = i3 + 1;
            return decodeJob.polloi(wiremanVar, obj, marialVar, sanenessVar, i, i2, cls, cls2, priority, dernVar, map, z, z2, z3, wiremanVar2, sanenessVar2, i3);
        }
    }

    /* JADX INFO: compiled from: Engine.java */
    public static class dern implements DecodeJob.marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final hemolysin.attabal.InterfaceC0631attabal f17699attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public volatile hemolysin.attabal f17700saneness;

        public dern(hemolysin.attabal.InterfaceC0631attabal interfaceC0631attabal) {
            this.f17699attabal = interfaceC0631attabal;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.marial
        public hemolysin.attabal attabal() {
            if (this.f17700saneness == null) {
                synchronized (this) {
                    try {
                        if (this.f17700saneness == null) {
                            this.f17700saneness = this.f17699attabal.build();
                        }
                        if (this.f17700saneness == null) {
                            this.f17700saneness = new hemolysin.saneness();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f17700saneness;
        }
    }

    /* JADX INFO: compiled from: Engine.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final autoboat.attabal f17701attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final impromptu.attabal f17702beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final technofreak.competently<competently<?>> f17703competently = naming.attabal.wireman(Opcodes.FCMPG, new attabal());

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final autoboat.attabal f17704dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final endosteum.wireman f17705marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final autoboat.attabal f17706saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final autoboat.attabal f17707wireman;

        /* JADX INFO: compiled from: Engine.java */
        public class attabal implements naming.attabal.wireman<competently<?>> {
            public attabal() {
            }

            @Override // naming.attabal.wireman
            /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
            public competently<?> attabal() {
                saneness sanenessVar = saneness.this;
                return new competently<>(sanenessVar.f17701attabal, sanenessVar.f17706saneness, sanenessVar.f17704dern, sanenessVar.f17707wireman, sanenessVar.f17705marial, sanenessVar.f17702beachfront, sanenessVar.f17703competently);
            }
        }

        public saneness(autoboat.attabal attabalVar, autoboat.attabal attabalVar2, autoboat.attabal attabalVar3, autoboat.attabal attabalVar4, endosteum.wireman wiremanVar, impromptu.attabal attabalVar5) {
            this.f17701attabal = attabalVar;
            this.f17706saneness = attabalVar2;
            this.f17704dern = attabalVar3;
            this.f17707wireman = attabalVar4;
            this.f17705marial = wiremanVar;
            this.f17702beachfront = attabalVar5;
        }

        public <R> competently<R> attabal(maggot.saneness sanenessVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((competently) com.bumptech.glide.util.apical.wireman(this.f17703competently.saneness())).formularize(sanenessVar, z, z2, z3, z4);
        }
    }

    /* JADX INFO: compiled from: Engine.java */
    public class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final competently<?> f17709attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final awlwort.impromptu f17711saneness;

        public wireman(awlwort.impromptu impromptuVar, competently<?> competentlyVar) {
            this.f17711saneness = impromptuVar;
            this.f17709attabal = competentlyVar;
        }

        public void attabal() {
            synchronized (beachfront.this) {
                this.f17709attabal.polloi(this.f17711saneness);
            }
        }
    }

    public beachfront(hemolysin.impromptu impromptuVar, hemolysin.attabal.InterfaceC0631attabal interfaceC0631attabal, autoboat.attabal attabalVar, autoboat.attabal attabalVar2, autoboat.attabal attabalVar3, autoboat.attabal attabalVar4, boolean z) {
        this(impromptuVar, interfaceC0631attabal, attabalVar, attabalVar2, attabalVar3, attabalVar4, null, null, null, null, null, null, z);
    }

    public static void cutely(String str, long j, maggot.saneness sanenessVar) {
        com.bumptech.glide.util.competently.attabal(j);
        Objects.toString(sanenessVar);
    }

    public void apical(endosteum.cutely<?> cutelyVar) {
        if (!(cutelyVar instanceof impromptu)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((impromptu) cutelyVar).beachfront();
    }

    @Override // com.bumptech.glide.load.engine.impromptu.attabal
    public void attabal(maggot.saneness sanenessVar, impromptu<?> impromptuVar) {
        this.f17691impromptu.wireman(sanenessVar);
        if (impromptuVar.marial()) {
            this.f17690dern.marial(sanenessVar, impromptuVar);
        } else {
            this.f17692marial.attabal(impromptuVar, false);
        }
    }

    public <R> wireman beachfront(com.bumptech.glide.wireman wiremanVar, Object obj, maggot.saneness sanenessVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, endosteum.dern dernVar, Map<Class<?>, maggot.competently<?>> map, boolean z, boolean z2, maggot.wireman wiremanVar2, boolean z3, boolean z4, boolean z5, boolean z6, awlwort.impromptu impromptuVar, Executor executor) {
        long jSaneness = f17686taiyuan ? com.bumptech.glide.util.competently.saneness() : 0L;
        endosteum.marial marialVarAttabal = this.f17693saneness.attabal(obj, sanenessVar, i, i2, map, cls, cls2, wiremanVar2);
        synchronized (this) {
            try {
                impromptu<?> impromptuVarTaiyuan = taiyuan(marialVarAttabal, z3, jSaneness);
                if (impromptuVarTaiyuan == null) {
                    return formularize(wiremanVar, obj, sanenessVar, i, i2, cls, cls2, priority, dernVar, map, z, z2, wiremanVar2, z3, z4, z5, z6, impromptuVar, executor, marialVarAttabal, jSaneness);
                }
                impromptuVar.dern(impromptuVarTaiyuan, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final impromptu<?> competently(maggot.saneness sanenessVar) {
        impromptu<?> impromptuVarMarial = this.f17691impromptu.marial(sanenessVar);
        if (impromptuVarMarial != null) {
            impromptuVarMarial.dern();
        }
        return impromptuVarMarial;
    }

    @Override // endosteum.wireman
    public synchronized void dern(competently<?> competentlyVar, maggot.saneness sanenessVar, impromptu<?> impromptuVar) {
        if (impromptuVar != null) {
            try {
                if (impromptuVar.marial()) {
                    this.f17691impromptu.attabal(sanenessVar, impromptuVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17687attabal.wireman(sanenessVar, competentlyVar);
    }

    public final <R> wireman formularize(com.bumptech.glide.wireman wiremanVar, Object obj, maggot.saneness sanenessVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, endosteum.dern dernVar, Map<Class<?>, maggot.competently<?>> map, boolean z, boolean z2, maggot.wireman wiremanVar2, boolean z3, boolean z4, boolean z5, boolean z6, awlwort.impromptu impromptuVar, Executor executor, endosteum.marial marialVar, long j) {
        competently<?> competentlyVarAttabal = this.f17687attabal.attabal(marialVar, z6);
        if (competentlyVarAttabal != null) {
            competentlyVarAttabal.marial(impromptuVar, executor);
            if (f17686taiyuan) {
                cutely("Added to existing load", j, marialVar);
            }
            return new wireman(impromptuVar, competentlyVarAttabal);
        }
        competently<R> competentlyVarAttabal2 = this.f17694wireman.attabal(marialVar, z3, z4, z5, z6);
        DecodeJob<R> decodeJobAttabal = this.f17689competently.attabal(wiremanVar, obj, marialVar, sanenessVar, i, i2, cls, cls2, priority, dernVar, map, z, z2, z6, wiremanVar2, competentlyVarAttabal2);
        this.f17687attabal.dern(marialVar, competentlyVarAttabal2);
        competentlyVarAttabal2.marial(impromptuVar, executor);
        competentlyVarAttabal2.molybdenite(decodeJobAttabal);
        if (f17686taiyuan) {
            cutely("Started new load", j, marialVar);
        }
        return new wireman(impromptuVar, competentlyVarAttabal2);
    }

    public final impromptu<?> impromptu(maggot.saneness sanenessVar) {
        impromptu<?> impromptuVarMarial = marial(sanenessVar);
        if (impromptuVarMarial != null) {
            impromptuVarMarial.dern();
            this.f17691impromptu.attabal(sanenessVar, impromptuVarMarial);
        }
        return impromptuVarMarial;
    }

    public final impromptu<?> marial(maggot.saneness sanenessVar) {
        endosteum.cutely<?> cutelyVarWireman = this.f17690dern.wireman(sanenessVar);
        if (cutelyVarWireman == null) {
            return null;
        }
        return cutelyVarWireman instanceof impromptu ? (impromptu) cutelyVarWireman : new impromptu<>(cutelyVarWireman, true, true, sanenessVar, this);
    }

    @Override // endosteum.wireman
    public synchronized void saneness(competently<?> competentlyVar, maggot.saneness sanenessVar) {
        this.f17687attabal.wireman(sanenessVar, competentlyVar);
    }

    public final impromptu<?> taiyuan(endosteum.marial marialVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        impromptu<?> impromptuVarCompetently = competently(marialVar);
        if (impromptuVarCompetently != null) {
            if (f17686taiyuan) {
                cutely("Loaded resource from active resources", j, marialVar);
            }
            return impromptuVarCompetently;
        }
        impromptu<?> impromptuVarImpromptu = impromptu(marialVar);
        if (impromptuVarImpromptu == null) {
            return null;
        }
        if (f17686taiyuan) {
            cutely("Loaded resource from cache", j, marialVar);
        }
        return impromptuVarImpromptu;
    }

    @Override // hemolysin.impromptu.attabal
    public void wireman(endosteum.cutely<?> cutelyVar) {
        this.f17692marial.attabal(cutelyVar, true);
    }

    public beachfront(hemolysin.impromptu impromptuVar, hemolysin.attabal.InterfaceC0631attabal interfaceC0631attabal, autoboat.attabal attabalVar, autoboat.attabal attabalVar2, autoboat.attabal attabalVar3, autoboat.attabal attabalVar4, endosteum.impromptu impromptuVar2, endosteum.beachfront beachfrontVar, com.bumptech.glide.load.engine.attabal attabalVar5, saneness sanenessVar, attabal attabalVar6, formularize formularizeVar, boolean z) {
        this.f17690dern = impromptuVar;
        dern dernVar = new dern(interfaceC0631attabal);
        this.f17688beachfront = dernVar;
        com.bumptech.glide.load.engine.attabal attabalVar7 = attabalVar5 == null ? new com.bumptech.glide.load.engine.attabal(z) : attabalVar5;
        this.f17691impromptu = attabalVar7;
        attabalVar7.beachfront(this);
        this.f17693saneness = beachfrontVar == null ? new endosteum.beachfront() : beachfrontVar;
        this.f17687attabal = impromptuVar2 == null ? new endosteum.impromptu() : impromptuVar2;
        this.f17694wireman = sanenessVar == null ? new saneness(attabalVar, attabalVar2, attabalVar3, attabalVar4, this, this) : sanenessVar;
        this.f17689competently = attabalVar6 == null ? new attabal(dernVar) : attabalVar6;
        this.f17692marial = formularizeVar == null ? new formularize() : formularizeVar;
        impromptuVar.dern(this);
    }
}
