package ghoulish;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cybernatic.privatdozent;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: H263Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class kowloon implements impassible {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final float[] f26924formularize = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final grimness f26926attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public saneness f26927beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f26928competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f26929cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public String f26931impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final gintrap f26932marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final decarock.stratoscope f26933saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public privatdozent f26934taiyuan;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean[] f26930dern = new boolean[4];

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final attabal f26935wireman = new attabal(128);

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f26925apical = C.TIME_UNSET;

    /* JADX INFO: compiled from: H263Reader.java */
    public static final class attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final byte[] f26936beachfront = {0, 0, 1};

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f26937attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f26938dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public byte[] f26939marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f26940saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f26941wireman;

        public attabal(int i) {
            this.f26939marial = new byte[i];
        }

        public void attabal(byte[] bArr, int i, int i2) {
            if (this.f26937attabal) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f26939marial;
                int length = bArr2.length;
                int i4 = this.f26938dern;
                if (length < i4 + i3) {
                    this.f26939marial = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f26939marial, this.f26938dern, i3);
                this.f26938dern += i3;
            }
        }

        public void dern() {
            this.f26937attabal = false;
            this.f26938dern = 0;
            this.f26940saneness = 0;
        }

        public boolean saneness(int i, int i2) {
            int i3 = this.f26940saneness;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.f26938dern -= i2;
                                this.f26937attabal = false;
                                return true;
                            }
                        } else if ((i & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            decarock.triweekly.impromptu("H263Reader", "Unexpected start code value");
                            dern();
                        } else {
                            this.f26941wireman = this.f26938dern;
                            this.f26940saneness = 4;
                        }
                    } else if (i > 31) {
                        decarock.triweekly.impromptu("H263Reader", "Unexpected start code value");
                        dern();
                    } else {
                        this.f26940saneness = 3;
                    }
                } else if (i != 181) {
                    decarock.triweekly.impromptu("H263Reader", "Unexpected start code value");
                    dern();
                } else {
                    this.f26940saneness = 2;
                }
            } else if (i == 176) {
                this.f26940saneness = 1;
                this.f26937attabal = true;
            }
            byte[] bArr = f26936beachfront;
            attabal(bArr, 0, bArr.length);
            return false;
        }
    }

    /* JADX INFO: compiled from: H263Reader.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final privatdozent f26942attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f26943beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public long f26944competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f26945dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public long f26946impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f26947marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public boolean f26948saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public boolean f26949wireman;

        public saneness(privatdozent privatdozentVar) {
            this.f26942attabal = privatdozentVar;
        }

        public void attabal(byte[] bArr, int i, int i2) {
            if (this.f26945dern) {
                int i3 = this.f26943beachfront;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f26943beachfront = i3 + (i2 - i);
                } else {
                    this.f26949wireman = ((bArr[i4] & 192) >> 6) == 0;
                    this.f26945dern = false;
                }
            }
        }

        public void dern(int i, long j) {
            this.f26947marial = i;
            this.f26949wireman = false;
            this.f26948saneness = i == 182 || i == 179;
            this.f26945dern = i == 182;
            this.f26943beachfront = 0;
            this.f26946impromptu = j;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void saneness(long j, int i, boolean z) {
            decarock.attabal.competently(this.f26946impromptu != C.TIME_UNSET);
            if (this.f26947marial == 182 && z && this.f26948saneness) {
                this.f26942attabal.wireman(this.f26946impromptu, this.f26949wireman ? 1 : 0, (int) (j - this.f26944competently), i, null);
            }
            if (this.f26947marial != 179) {
                this.f26944competently = j;
            }
        }

        public void wireman() {
            this.f26948saneness = false;
            this.f26945dern = false;
            this.f26949wireman = false;
            this.f26947marial = -1;
        }
    }

    public kowloon(grimness grimnessVar) {
        this.f26926attabal = grimnessVar;
        if (grimnessVar != null) {
            this.f26932marial = new gintrap(Opcodes.GETSTATIC, 128);
            this.f26933saneness = new decarock.stratoscope();
        } else {
            this.f26932marial = null;
            this.f26933saneness = null;
        }
    }

    public static androidx.media3.common.polloi marial(attabal attabalVar, int i, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(attabalVar.f26939marial, attabalVar.f26938dern);
        decarock.cuirassed cuirassedVar = new decarock.cuirassed(bArrCopyOf);
        cuirassedVar.molybdenite(i);
        cuirassedVar.molybdenite(4);
        cuirassedVar.monoploid();
        cuirassedVar.polloi(8);
        if (cuirassedVar.competently()) {
            cuirassedVar.polloi(4);
            cuirassedVar.polloi(3);
        }
        int iImpromptu = cuirassedVar.impromptu(4);
        float f = 1.0f;
        if (iImpromptu == 15) {
            int iImpromptu2 = cuirassedVar.impromptu(8);
            int iImpromptu3 = cuirassedVar.impromptu(8);
            if (iImpromptu3 == 0) {
                decarock.triweekly.impromptu("H263Reader", "Invalid aspect ratio");
            } else {
                f = iImpromptu2 / iImpromptu3;
            }
        } else {
            float[] fArr = f26924formularize;
            if (iImpromptu < fArr.length) {
                f = fArr[iImpromptu];
            } else {
                decarock.triweekly.impromptu("H263Reader", "Invalid aspect ratio");
            }
        }
        if (cuirassedVar.competently()) {
            cuirassedVar.polloi(2);
            cuirassedVar.polloi(1);
            if (cuirassedVar.competently()) {
                cuirassedVar.polloi(15);
                cuirassedVar.monoploid();
                cuirassedVar.polloi(15);
                cuirassedVar.monoploid();
                cuirassedVar.polloi(15);
                cuirassedVar.monoploid();
                cuirassedVar.polloi(3);
                cuirassedVar.polloi(11);
                cuirassedVar.monoploid();
                cuirassedVar.polloi(15);
                cuirassedVar.monoploid();
            }
        }
        if (cuirassedVar.impromptu(2) != 0) {
            decarock.triweekly.impromptu("H263Reader", "Unhandled video object layer shape");
        }
        cuirassedVar.monoploid();
        int iImpromptu4 = cuirassedVar.impromptu(16);
        cuirassedVar.monoploid();
        if (cuirassedVar.competently()) {
            if (iImpromptu4 == 0) {
                decarock.triweekly.impromptu("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = iImpromptu4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                cuirassedVar.polloi(i2);
            }
        }
        cuirassedVar.monoploid();
        int iImpromptu5 = cuirassedVar.impromptu(13);
        cuirassedVar.monoploid();
        int iImpromptu6 = cuirassedVar.impromptu(13);
        cuirassedVar.monoploid();
        cuirassedVar.monoploid();
        return new androidx.media3.common.polloi.saneness().cultivated(str).sensatory(MimeTypes.VIDEO_MP4V).palmyra(iImpromptu5).dent(iImpromptu6).sayid(f).premeiotic(Collections.singletonList(bArrCopyOf)).polder();
    }

    @Override // ghoulish.impassible
    public void attabal(decarock.stratoscope stratoscopeVar) {
        decarock.attabal.taiyuan(this.f26927beachfront);
        decarock.attabal.taiyuan(this.f26934taiyuan);
        int iBeachfront = stratoscopeVar.beachfront();
        int iCompetently = stratoscopeVar.competently();
        byte[] bArrMarial = stratoscopeVar.marial();
        this.f26928competently += (long) stratoscopeVar.attabal();
        this.f26934taiyuan.saneness(stratoscopeVar, stratoscopeVar.attabal());
        while (true) {
            int iDern = tailoring.attabal.dern(bArrMarial, iBeachfront, iCompetently, this.f26930dern);
            if (iDern == iCompetently) {
                break;
            }
            int i = iDern + 3;
            int i2 = stratoscopeVar.marial()[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i3 = iDern - iBeachfront;
            int i4 = 0;
            if (!this.f26929cutely) {
                if (i3 > 0) {
                    this.f26935wireman.attabal(bArrMarial, iBeachfront, iDern);
                }
                if (this.f26935wireman.saneness(i2, i3 < 0 ? -i3 : 0)) {
                    privatdozent privatdozentVar = this.f26934taiyuan;
                    attabal attabalVar = this.f26935wireman;
                    privatdozentVar.dern(marial(attabalVar, attabalVar.f26941wireman, (String) decarock.attabal.marial(this.f26931impromptu)));
                    this.f26929cutely = true;
                }
            }
            this.f26927beachfront.attabal(bArrMarial, iBeachfront, iDern);
            gintrap gintrapVar = this.f26932marial;
            if (gintrapVar != null) {
                if (i3 > 0) {
                    gintrapVar.attabal(bArrMarial, iBeachfront, iDern);
                } else {
                    i4 = -i3;
                }
                if (this.f26932marial.saneness(i4)) {
                    gintrap gintrapVar2 = this.f26932marial;
                    ((decarock.stratoscope) decarock.grimness.impromptu(this.f26933saneness)).walach(this.f26932marial.f26891wireman, tailoring.attabal.polloi(gintrapVar2.f26891wireman, gintrapVar2.f26889marial));
                    ((grimness) decarock.grimness.impromptu(this.f26926attabal)).attabal(this.f26925apical, this.f26933saneness);
                }
                if (i2 == 178 && stratoscopeVar.marial()[iDern + 2] == 1) {
                    this.f26932marial.marial(i2);
                }
            }
            int i5 = iCompetently - iDern;
            this.f26927beachfront.saneness(this.f26928competently - ((long) i5), i5, this.f26929cutely);
            this.f26927beachfront.dern(i2, this.f26925apical);
            iBeachfront = i;
        }
        if (!this.f26929cutely) {
            this.f26935wireman.attabal(bArrMarial, iBeachfront, iCompetently);
        }
        this.f26927beachfront.attabal(bArrMarial, iBeachfront, iCompetently);
        gintrap gintrapVar3 = this.f26932marial;
        if (gintrapVar3 != null) {
            gintrapVar3.attabal(bArrMarial, iBeachfront, iCompetently);
        }
    }

    @Override // ghoulish.impassible
    public void dern(boolean z) {
        decarock.attabal.taiyuan(this.f26927beachfront);
        if (z) {
            this.f26927beachfront.saneness(this.f26928competently, 0, this.f26929cutely);
            this.f26927beachfront.wireman();
        }
    }

    @Override // ghoulish.impassible
    public void saneness(cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        wiremanVar.attabal();
        this.f26931impromptu = wiremanVar.saneness();
        privatdozent privatdozentVarTrack = polloiVar.track(wiremanVar.dern(), 2);
        this.f26934taiyuan = privatdozentVarTrack;
        this.f26927beachfront = new saneness(privatdozentVarTrack);
        grimness grimnessVar = this.f26926attabal;
        if (grimnessVar != null) {
            grimnessVar.saneness(polloiVar, wiremanVar);
        }
    }

    @Override // ghoulish.impassible
    public void seek() {
        tailoring.attabal.attabal(this.f26930dern);
        this.f26935wireman.dern();
        saneness sanenessVar = this.f26927beachfront;
        if (sanenessVar != null) {
            sanenessVar.wireman();
        }
        gintrap gintrapVar = this.f26932marial;
        if (gintrapVar != null) {
            gintrapVar.wireman();
        }
        this.f26928competently = 0L;
        this.f26925apical = C.TIME_UNSET;
    }

    @Override // ghoulish.impassible
    public void wireman(long j, int i) {
        this.f26925apical = j;
    }
}
