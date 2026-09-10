package p002kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.load.java.graveside;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.beachfront;

/* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* JADX INFO: loaded from: classes5.dex */
public class attabal implements monoploid.dern {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Map<byname.saneness, KotlinClassHeader.Kind> f30770apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static boolean f30771cutely;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int[] f30772attabal = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public String f30778saneness = null;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f30775dern = 0;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public String f30780wireman = null;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String[] f30777marial = null;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public String[] f30773beachfront = null;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public String[] f30774competently = null;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public KotlinClassHeader.Kind f30776impromptu = null;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public String[] f30779taiyuan = null;

    /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public static abstract class saneness implements monoploid.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final List<String> f30787attabal = new ArrayList();

        private static /* synthetic */ void beachfront(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.saneness
        public void attabal() {
            competently((String[]) this.f30787attabal.toArray(new String[0]));
        }

        public abstract void competently(String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.saneness
        public void dern(Object obj) {
            if (obj instanceof String) {
                this.f30787attabal.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.saneness
        public monoploid.attabal marial(byname.saneness sanenessVar) {
            if (sanenessVar != null) {
                return null;
            }
            beachfront(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.saneness
        public void saneness(byname.saneness sanenessVar, byname.marial marialVar) {
            if (sanenessVar == null) {
                beachfront(0);
            }
            if (marialVar == null) {
                beachfront(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.saneness
        public void wireman(beachfront beachfrontVar) {
            if (beachfrontVar == null) {
                beachfront(2);
            }
        }
    }

    static {
        try {
            f30771cutely = a.g.equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f30771cutely = false;
        }
        HashMap map = new HashMap();
        f30770apical = map;
        map.put(byname.saneness.impassible(new byname.dern("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        map.put(byname.saneness.impassible(new byname.dern("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        map.put(byname.saneness.impassible(new byname.dern("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        map.put(byname.saneness.impassible(new byname.dern("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        map.put(byname.saneness.impassible(new byname.dern("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    public static /* synthetic */ void wireman(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.dern
    public monoploid.attabal dern(byname.saneness sanenessVar, walach walachVar) {
        KotlinClassHeader.Kind kind;
        if (sanenessVar == null) {
            wireman(0);
        }
        if (walachVar == null) {
            wireman(1);
        }
        byname.dern dernVarSaneness = sanenessVar.saneness();
        if (dernVarSaneness.equals(graveside.f30418attabal)) {
            return new dern();
        }
        if (dernVarSaneness.equals(graveside.f30426graveside)) {
            return new wireman();
        }
        if (f30771cutely || this.f30776impromptu != null || (kind = f30770apical.get(sanenessVar)) == null) {
            return null;
        }
        this.f30776impromptu = kind;
        return new marial();
    }

    public KotlinClassHeader impassible(foreshot.marial marialVar) {
        if (this.f30776impromptu == null || this.f30772attabal == null) {
            return null;
        }
        foreshot.marial marialVar2 = new foreshot.marial(this.f30772attabal, (this.f30775dern & 8) != 0);
        if (!marialVar2.impromptu(marialVar)) {
            this.f30774competently = this.f30777marial;
            this.f30777marial = null;
        } else if (kowloon() && this.f30777marial == null) {
            return null;
        }
        String[] strArr = this.f30779taiyuan;
        return new KotlinClassHeader(this.f30776impromptu, marialVar2, this.f30777marial, this.f30774competently, this.f30773beachfront, this.f30778saneness, this.f30775dern, this.f30780wireman, strArr != null ? foreshot.attabal.marial(strArr) : null);
    }

    public final boolean kowloon() {
        KotlinClassHeader.Kind kind = this.f30776impromptu;
        return kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
    }

    public KotlinClassHeader triweekly() {
        return impassible(foreshot.marial.f26283taiyuan);
    }

    /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public class dern implements monoploid.attabal {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.attabal$dern$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        public class C0688attabal extends saneness {
            public C0688attabal() {
            }

            public static /* synthetic */ void beachfront(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.attabal.saneness
            public void competently(String[] strArr) {
                if (strArr == null) {
                    beachfront(0);
                }
                attabal.this.f30777marial = strArr;
            }
        }

        /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        public class saneness extends saneness {
            public saneness() {
            }

            private static /* synthetic */ void beachfront(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.attabal.saneness
            public void competently(String[] strArr) {
                if (strArr == null) {
                    beachfront(0);
                }
                attabal.this.f30773beachfront = strArr;
            }
        }

        public dern() {
        }

        public static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void beachfront(byname.marial marialVar, beachfront beachfrontVar) {
            if (beachfrontVar == null) {
                competently(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public monoploid.saneness dern(byname.marial marialVar) {
            String strDern = marialVar != null ? marialVar.dern() : null;
            if ("d1".equals(strDern)) {
                return impromptu();
            }
            if ("d2".equals(strDern)) {
                return taiyuan();
            }
            return null;
        }

        public final monoploid.saneness impromptu() {
            return new C0688attabal();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void marial(byname.marial marialVar, Object obj) {
            if (marialVar == null) {
                return;
            }
            String strDern = marialVar.dern();
            if (CampaignEx.JSON_KEY_AD_K.equals(strDern)) {
                if (obj instanceof Integer) {
                    attabal.this.f30776impromptu = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strDern)) {
                if (obj instanceof int[]) {
                    attabal.this.f30772attabal = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strDern)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    attabal.this.f30778saneness = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strDern)) {
                if (obj instanceof Integer) {
                    attabal.this.f30775dern = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strDern) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                attabal.this.f30780wireman = str2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void saneness(byname.marial marialVar, byname.saneness sanenessVar, byname.marial marialVar2) {
            if (sanenessVar == null) {
                competently(1);
            }
            if (marialVar2 == null) {
                competently(2);
            }
        }

        public final monoploid.saneness taiyuan() {
            return new saneness();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public monoploid.attabal wireman(byname.marial marialVar, byname.saneness sanenessVar) {
            if (sanenessVar != null) {
                return null;
            }
            competently(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void attabal() {
        }
    }

    /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public class marial implements monoploid.attabal {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.attabal$marial$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        public class C0689attabal extends saneness {
            public C0689attabal() {
            }

            private static /* synthetic */ void beachfront(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.attabal.saneness
            public void competently(String[] strArr) {
                if (strArr == null) {
                    beachfront(0);
                }
                attabal.this.f30777marial = strArr;
            }
        }

        /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        public class saneness extends saneness {
            public saneness() {
            }

            private static /* synthetic */ void beachfront(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.attabal.saneness
            public void competently(String[] strArr) {
                if (strArr == null) {
                    beachfront(0);
                }
                attabal.this.f30773beachfront = strArr;
            }
        }

        public marial() {
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private monoploid.saneness impromptu() {
            return new C0689attabal();
        }

        private monoploid.saneness taiyuan() {
            return new saneness();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void beachfront(byname.marial marialVar, beachfront beachfrontVar) {
            if (beachfrontVar == null) {
                competently(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public monoploid.saneness dern(byname.marial marialVar) {
            String strDern = marialVar != null ? marialVar.dern() : null;
            if ("data".equals(strDern) || "filePartClassNames".equals(strDern)) {
                return impromptu();
            }
            if ("strings".equals(strDern)) {
                return taiyuan();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void marial(byname.marial marialVar, Object obj) {
            if (marialVar == null) {
                return;
            }
            String strDern = marialVar.dern();
            if ("version".equals(strDern)) {
                if (obj instanceof int[]) {
                    attabal.this.f30772attabal = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strDern)) {
                attabal.this.f30778saneness = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void saneness(byname.marial marialVar, byname.saneness sanenessVar, byname.marial marialVar2) {
            if (sanenessVar == null) {
                competently(1);
            }
            if (marialVar2 == null) {
                competently(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public monoploid.attabal wireman(byname.marial marialVar, byname.saneness sanenessVar) {
            if (sanenessVar != null) {
                return null;
            }
            competently(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void attabal() {
        }
    }

    /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    public class wireman implements monoploid.attabal {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.attabal$wireman$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        public class C0690attabal extends saneness {
            public C0690attabal() {
            }

            private static /* synthetic */ void beachfront(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.attabal.saneness
            public void competently(String[] strArr) {
                if (strArr == null) {
                    beachfront(0);
                }
                attabal.this.f30779taiyuan = strArr;
            }
        }

        public wireman() {
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void beachfront(byname.marial marialVar, beachfront beachfrontVar) {
            if (beachfrontVar == null) {
                competently(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public monoploid.saneness dern(byname.marial marialVar) {
            if (DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B.equals(marialVar != null ? marialVar.dern() : null)) {
                return impromptu();
            }
            return null;
        }

        public final monoploid.saneness impromptu() {
            return new C0690attabal();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void saneness(byname.marial marialVar, byname.saneness sanenessVar, byname.marial marialVar2) {
            if (sanenessVar == null) {
                competently(1);
            }
            if (marialVar2 == null) {
                competently(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public monoploid.attabal wireman(byname.marial marialVar, byname.saneness sanenessVar) {
            if (sanenessVar != null) {
                return null;
            }
            competently(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void attabal() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.attabal
        public void marial(byname.marial marialVar, Object obj) {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.dern
    public void attabal() {
    }
}
