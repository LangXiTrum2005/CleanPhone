package interaction;

import com.ironsource.X3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.io.AccessDeniedException;
import p002kotlin.io.FileWalkDirection;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.sequences.Sequence;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u0016\u0018Bm\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Linteraction/wireman;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "Lkotlin/io/FileWalkDirection;", "direction", "Lkotlin/Function1;", "", "onEnter", "", "onLeave", "Lkotlin/Function2;", "Ljava/io/IOException;", "onFail", "", "maxDepth", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "", "iterator", "()Ljava/util/Iterator;", "attabal", "Ljava/io/File;", "saneness", "Lkotlin/io/FileWalkDirection;", "dern", "Lkotlin/jvm/functions/Function1;", "wireman", "marial", "Lkotlin/jvm/functions/Function2;", "beachfront", "I", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wireman implements Sequence<File> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final File start;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final int maxDepth;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Function1<File, Boolean> onEnter;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Function2<File, IOException, Unit> onFail;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final FileWalkDirection direction;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final Function1<File, Unit> onLeave;

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Linteraction/wireman$attabal;", "Linteraction/wireman$dern;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class attabal extends dern {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Linteraction/wireman$dern;", "", "Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "saneness", "()Ljava/io/File;", "attabal", "Ljava/io/File;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final File root;

        public dern(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.root = root;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final File getRoot() {
            return this.root;
        }

        public abstract File saneness();
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0082\u0010¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Linteraction/wireman$saneness;", "Lkotlin/collections/dern;", "Ljava/io/File;", "<init>", "(Linteraction/wireman;)V", "", "saneness", "()V", "root", "Linteraction/wireman$attabal;", "competently", "(Ljava/io/File;)Linteraction/wireman$attabal;", "impromptu", "()Ljava/io/File;", "Ljava/util/ArrayDeque;", "Linteraction/wireman$dern;", "monoploid", "Ljava/util/ArrayDeque;", "state", "attabal", "dern", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class saneness extends p002kotlin.collections.dern<File> {

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public final ArrayDeque<dern> state;

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Linteraction/wireman$saneness$attabal;", "Linteraction/wireman$attabal;", "Ljava/io/File;", "rootDir", "<init>", "(Linteraction/wireman$saneness;Ljava/io/File;)V", "saneness", "()Ljava/io/File;", "", "Z", "rootVisited", "", "dern", "[Ljava/io/File;", "fileList", "", "wireman", "I", "fileIndex", "marial", X3.i.t, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class attabal extends attabal {

            /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
            public final /* synthetic */ saneness f28924beachfront;

            /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
            public File[] fileList;

            /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
            public boolean failed;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
            public boolean rootVisited;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
            public int fileIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public attabal(saneness sanenessVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f28924beachfront = sanenessVar;
            }

            @Override // interaction.wireman.dern
            public File saneness() {
                if (!this.failed && this.fileList == null) {
                    Function1 function1 = wireman.this.onEnter;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.fileList = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = wireman.this.onFail;
                        if (function2 != null) {
                            function2.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.failed = true;
                    }
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i = this.fileIndex;
                    Intrinsics.beachfront(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.fileList;
                        Intrinsics.beachfront(fileArr2);
                        int i2 = this.fileIndex;
                        this.fileIndex = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.rootVisited) {
                    this.rootVisited = true;
                    return getRoot();
                }
                Function1 function3 = wireman.this.onLeave;
                if (function3 != null) {
                    function3.invoke(getRoot());
                }
                return null;
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Linteraction/wireman$saneness$dern;", "Linteraction/wireman$attabal;", "Ljava/io/File;", "rootDir", "<init>", "(Linteraction/wireman$saneness;Ljava/io/File;)V", "saneness", "()Ljava/io/File;", "", "Z", "rootVisited", "", "dern", "[Ljava/io/File;", "fileList", "", "wireman", "I", "fileIndex", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class dern extends attabal {

            /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
            public File[] fileList;

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public final /* synthetic */ saneness f28930marial;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
            public boolean rootVisited;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
            public int fileIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public dern(saneness sanenessVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f28930marial = sanenessVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // interaction.wireman.dern
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File saneness() {
                /*
                    r9 = this;
                    boolean r0 = r9.rootVisited
                    r1 = 0
                    if (r0 != 0) goto L28
                    interaction.wireman$saneness r0 = r9.f28930marial
                    interaction.wireman r0 = interaction.wireman.this
                    kotlin.jvm.functions.Function1 r0 = interaction.wireman.marial(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.getRoot()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.rootVisited = r0
                    java.io.File r0 = r9.getRoot()
                    return r0
                L28:
                    java.io.File[] r0 = r9.fileList
                    if (r0 == 0) goto L47
                    int r2 = r9.fileIndex
                    p002kotlin.jvm.internal.Intrinsics.beachfront(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    interaction.wireman$saneness r0 = r9.f28930marial
                    interaction.wireman r0 = interaction.wireman.this
                    kotlin.jvm.functions.Function1 r0 = interaction.wireman.competently(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.getRoot()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.fileList
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r9.fileList = r0
                    if (r0 != 0) goto L76
                    interaction.wireman$saneness r0 = r9.f28930marial
                    interaction.wireman r0 = interaction.wireman.this
                    kotlin.jvm.functions.Function2 r0 = interaction.wireman.beachfront(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.getRoot()
                    kotlin.io.AccessDeniedException r3 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r9.getRoot()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.fileList
                    if (r0 == 0) goto L80
                    p002kotlin.jvm.internal.Intrinsics.beachfront(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    interaction.wireman$saneness r0 = r9.f28930marial
                    interaction.wireman r0 = interaction.wireman.this
                    kotlin.jvm.functions.Function1 r0 = interaction.wireman.competently(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.getRoot()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.fileList
                    p002kotlin.jvm.internal.Intrinsics.beachfront(r0)
                    int r1 = r9.fileIndex
                    int r2 = r1 + 1
                    r9.fileIndex = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: interaction.wireman.saneness.dern.saneness():java.io.File");
            }
        }

        /* JADX INFO: renamed from: interaction.wireman$saneness$saneness, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Linteraction/wireman$saneness$saneness;", "Linteraction/wireman$dern;", "Ljava/io/File;", "rootFile", "<init>", "(Linteraction/wireman$saneness;Ljava/io/File;)V", "saneness", "()Ljava/io/File;", "", "Z", "visited", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class C0654saneness extends dern {

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public final /* synthetic */ saneness f28933dern;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
            public boolean visited;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0654saneness(saneness sanenessVar, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f28933dern = sanenessVar;
            }

            @Override // interaction.wireman.dern
            public File saneness() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }

        /* JADX INFO: renamed from: interaction.wireman$saneness$wireman, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0655wireman {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final /* synthetic */ int[] f28935attabal;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f28935attabal = iArr;
            }
        }

        public saneness() {
            ArrayDeque<dern> arrayDeque = new ArrayDeque<>();
            this.state = arrayDeque;
            if (wireman.this.start.isDirectory()) {
                arrayDeque.push(competently(wireman.this.start));
            } else if (wireman.this.start.isFile()) {
                arrayDeque.push(new C0654saneness(this, wireman.this.start));
            } else {
                wireman();
            }
        }

        public final attabal competently(File root) {
            int i = C0655wireman.f28935attabal[wireman.this.direction.ordinal()];
            if (i == 1) {
                return new dern(this, root);
            }
            if (i == 2) {
                return new attabal(this, root);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final File impromptu() {
            while (true) {
                dern dernVarPeek = this.state.peek();
                if (dernVarPeek == null) {
                    return null;
                }
                File fileSaneness = dernVarPeek.saneness();
                if (fileSaneness == null) {
                    this.state.pop();
                } else {
                    if (Intrinsics.wireman(fileSaneness, dernVarPeek.getRoot()) || !fileSaneness.isDirectory() || this.state.size() >= wireman.this.maxDepth) {
                        return fileSaneness;
                    }
                    this.state.push(competently(fileSaneness));
                }
            }
        }

        @Override // p002kotlin.collections.dern
        public void saneness() {
            File fileImpromptu = impromptu();
            if (fileImpromptu != null) {
                marial(fileImpromptu);
            } else {
                wireman();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wireman(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function2, Function2<? super File, ? super IOException, Unit> function3, int i) {
        this.start = file;
        this.direction = fileWalkDirection;
        this.onEnter = function1;
        this.onLeave = function2;
        this.onFail = function3;
        this.maxDepth = i;
    }

    @Override // p002kotlin.sequences.Sequence
    public Iterator<File> iterator() {
        return new saneness();
    }

    public /* synthetic */ wireman(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function2, function3, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wireman(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }
}
