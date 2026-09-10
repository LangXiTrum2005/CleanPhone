package ghoulish;

import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cybernatic.privatdozent;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: H262Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class triweekly implements impassible {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final double[] f27104monoploid = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f27105apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f27106arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f27107attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean[] f27108beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final attabal f27109competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f27110cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final grimness f27111dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public long f27112formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public long f27113impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public long f27114impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f27115kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final gintrap f27116marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public privatdozent f27117saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f27118taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public long f27119triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final decarock.stratoscope f27120wireman;

    /* JADX INFO: compiled from: H262Reader.java */
    public static final class attabal {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final byte[] f27121marial = {0, 0, 1};

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f27122attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f27123dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f27124saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public byte[] f27125wireman;

        public attabal(int i) {
            this.f27125wireman = new byte[i];
        }

        public void attabal(byte[] bArr, int i, int i2) {
            if (this.f27122attabal) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f27125wireman;
                int length = bArr2.length;
                int i4 = this.f27124saneness;
                if (length < i4 + i3) {
                    this.f27125wireman = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f27125wireman, this.f27124saneness, i3);
                this.f27124saneness += i3;
            }
        }

        public void dern() {
            this.f27122attabal = false;
            this.f27124saneness = 0;
            this.f27123dern = 0;
        }

        public boolean saneness(int i, int i2) {
            if (this.f27122attabal) {
                int i3 = this.f27124saneness - i2;
                this.f27124saneness = i3;
                if (this.f27123dern != 0 || i != 181) {
                    this.f27122attabal = false;
                    return true;
                }
                this.f27123dern = i3;
            } else if (i == 179) {
                this.f27122attabal = true;
            }
            byte[] bArr = f27121marial;
            attabal(bArr, 0, bArr.length);
            return false;
        }
    }

    public triweekly() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    public static Pair<androidx.media3.common.polloi, Long> marial(attabal attabalVar, String str) {
        float f;
        int i;
        float f2;
        int i2;
        long j;
        double[] dArr;
        double d;
        int i3;
        int i4;
        byte[] bArrCopyOf = Arrays.copyOf(attabalVar.f27125wireman, attabalVar.f27124saneness);
        int i5 = bArrCopyOf[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte b = bArrCopyOf[5];
        int i6 = (i5 << 4) | ((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4);
        int i7 = ((b & 15) << 8) | (bArrCopyOf[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int i8 = (bArrCopyOf[7] & 240) >> 4;
        if (i8 == 2) {
            f = i7 * 4;
            i = i6 * 3;
        } else {
            if (i8 != 3) {
                if (i8 != 4) {
                    f2 = 1.0f;
                } else {
                    f = i7 * 121;
                    i = i6 * 100;
                }
                androidx.media3.common.polloi polloiVarPolder = new androidx.media3.common.polloi.saneness().cultivated(str).sensatory(MimeTypes.VIDEO_MPEG2).palmyra(i6).dent(i7).sayid(f2).premeiotic(Collections.singletonList(bArrCopyOf)).polder();
                i2 = (bArrCopyOf[7] & 15) - 1;
                if (i2 >= 0) {
                    dArr = f27104monoploid;
                    if (i2 < dArr.length) {
                        d = dArr[i2];
                        byte b2 = bArrCopyOf[attabalVar.f27123dern + 9];
                        i3 = (b2 & 96) >> 5;
                        i4 = b2 & 31;
                        if (i3 != i4) {
                            d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                        }
                        j = (long) (1000000.0d / d);
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                return Pair.create(polloiVarPolder, Long.valueOf(j));
            }
            f = i7 * 16;
            i = i6 * 9;
        }
        f2 = f / i;
        androidx.media3.common.polloi polloiVarPolder2 = new androidx.media3.common.polloi.saneness().cultivated(str).sensatory(MimeTypes.VIDEO_MPEG2).palmyra(i6).dent(i7).sayid(f2).premeiotic(Collections.singletonList(bArrCopyOf)).polder();
        i2 = (bArrCopyOf[7] & 15) - 1;
        if (i2 >= 0) {
            dArr = f27104monoploid;
            if (i2 < dArr.length) {
                d = dArr[i2];
                byte b3 = bArrCopyOf[attabalVar.f27123dern + 9];
                i3 = (b3 & 96) >> 5;
                i4 = b3 & 31;
                if (i3 != i4) {
                    d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                }
                j = (long) (1000000.0d / d);
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        return Pair.create(polloiVarPolder2, Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
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
    @Override // ghoulish.impassible
    public void attabal(decarock.stratoscope stratoscopeVar) {
        boolean z;
        int i;
        decarock.attabal.taiyuan(this.f27117saneness);
        int iBeachfront = stratoscopeVar.beachfront();
        int iCompetently = stratoscopeVar.competently();
        byte[] bArrMarial = stratoscopeVar.marial();
        this.f27114impromptu += (long) stratoscopeVar.attabal();
        this.f27117saneness.saneness(stratoscopeVar, stratoscopeVar.attabal());
        while (true) {
            int iDern = tailoring.attabal.dern(bArrMarial, iBeachfront, iCompetently, this.f27108beachfront);
            if (iDern == iCompetently) {
                break;
            }
            int i2 = iDern + 3;
            int i3 = stratoscopeVar.marial()[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i4 = iDern - iBeachfront;
            if (!this.f27110cutely) {
                if (i4 > 0) {
                    this.f27109competently.attabal(bArrMarial, iBeachfront, iDern);
                }
                if (this.f27109competently.saneness(i3, i4 < 0 ? -i4 : 0)) {
                    Pair<androidx.media3.common.polloi, Long> pairMarial = marial(this.f27109competently, (String) decarock.attabal.marial(this.f27107attabal));
                    this.f27117saneness.dern((androidx.media3.common.polloi) pairMarial.first);
                    this.f27105apical = ((Long) pairMarial.second).longValue();
                    this.f27110cutely = true;
                }
            }
            gintrap gintrapVar = this.f27116marial;
            if (gintrapVar != null) {
                if (i4 > 0) {
                    gintrapVar.attabal(bArrMarial, iBeachfront, iDern);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.f27116marial.saneness(i)) {
                    gintrap gintrapVar2 = this.f27116marial;
                    ((decarock.stratoscope) decarock.grimness.impromptu(this.f27120wireman)).walach(this.f27116marial.f26891wireman, tailoring.attabal.polloi(gintrapVar2.f26891wireman, gintrapVar2.f26889marial));
                    ((grimness) decarock.grimness.impromptu(this.f27111dern)).attabal(this.f27119triweekly, this.f27120wireman);
                }
                if (i3 == 178 && stratoscopeVar.marial()[iDern + 2] == 1) {
                    this.f27116marial.marial(i3);
                }
            }
            if (i3 == 0 || i3 == 179) {
                int i5 = iCompetently - iDern;
                if (this.f27106arytenoidectomy && this.f27110cutely) {
                    long j = this.f27119triweekly;
                    if (j != C.TIME_UNSET) {
                        this.f27117saneness.wireman(j, this.f27115kowloon ? 1 : 0, ((int) (this.f27114impromptu - this.f27113impassible)) - i5, i5, null);
                    }
                }
                if (!this.f27118taiyuan || this.f27106arytenoidectomy) {
                    this.f27113impassible = this.f27114impromptu - ((long) i5);
                    long j2 = this.f27112formularize;
                    if (j2 == C.TIME_UNSET) {
                        long j3 = this.f27119triweekly;
                        j2 = j3 != C.TIME_UNSET ? j3 + this.f27105apical : -9223372036854775807L;
                    }
                    this.f27119triweekly = j2;
                    this.f27115kowloon = false;
                    this.f27112formularize = C.TIME_UNSET;
                    z = true;
                    this.f27118taiyuan = true;
                } else {
                    z = true;
                }
                this.f27106arytenoidectomy = i3 == 0 ? z : false;
            } else {
                if (i3 == 184) {
                    this.f27115kowloon = true;
                }
                iCompetently = iCompetently;
            }
            iCompetently = iCompetently;
            iBeachfront = i2;
        }
        if (!this.f27110cutely) {
            this.f27109competently.attabal(bArrMarial, iBeachfront, iCompetently);
        }
        gintrap gintrapVar3 = this.f27116marial;
        if (gintrapVar3 != null) {
            gintrapVar3.attabal(bArrMarial, iBeachfront, iCompetently);
        }
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
    @Override // ghoulish.impassible
    public void dern(boolean z) {
        decarock.attabal.taiyuan(this.f27117saneness);
        if (z) {
            boolean z2 = this.f27115kowloon;
            this.f27117saneness.wireman(this.f27119triweekly, z2 ? 1 : 0, (int) (this.f27114impromptu - this.f27113impassible), 0, null);
        }
    }

    @Override // ghoulish.impassible
    public void saneness(cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        wiremanVar.attabal();
        this.f27107attabal = wiremanVar.saneness();
        this.f27117saneness = polloiVar.track(wiremanVar.dern(), 2);
        grimness grimnessVar = this.f27111dern;
        if (grimnessVar != null) {
            grimnessVar.saneness(polloiVar, wiremanVar);
        }
    }

    @Override // ghoulish.impassible
    public void seek() {
        tailoring.attabal.attabal(this.f27108beachfront);
        this.f27109competently.dern();
        gintrap gintrapVar = this.f27116marial;
        if (gintrapVar != null) {
            gintrapVar.wireman();
        }
        this.f27114impromptu = 0L;
        this.f27118taiyuan = false;
        this.f27112formularize = C.TIME_UNSET;
        this.f27119triweekly = C.TIME_UNSET;
    }

    @Override // ghoulish.impassible
    public void wireman(long j, int i) {
        this.f27112formularize = j;
    }

    public triweekly(grimness grimnessVar) {
        this.f27111dern = grimnessVar;
        this.f27108beachfront = new boolean[4];
        this.f27109competently = new attabal(128);
        if (grimnessVar != null) {
            this.f27116marial = new gintrap(Opcodes.GETSTATIC, 128);
            this.f27120wireman = new decarock.stratoscope();
        } else {
            this.f27116marial = null;
            this.f27120wireman = null;
        }
        this.f27112formularize = C.TIME_UNSET;
        this.f27119triweekly = C.TIME_UNSET;
    }
}
