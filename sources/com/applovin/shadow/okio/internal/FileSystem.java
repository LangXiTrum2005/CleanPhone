package com.applovin.shadow.okio.internal;

import ak.f;
import ck.c;
import ck.e;
import ck.h;
import com.applovin.impl.ca;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.Source;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import no.b;
import qk.i0;
import wj.r;
import xj.j;
import zm.i;
import zm.k;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\r\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aK\u0010 \u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/applovin/shadow/okio/FileSystem;", "Lcom/applovin/shadow/okio/Path;", "path", "Lcom/applovin/shadow/okio/FileMetadata;", "commonMetadata", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileMetadata;", "", "commonExists", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;)Z", "dir", "mustCreate", "Lwj/r;", "commonCreateDirectories", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;Z)V", "source", "target", "commonCopy", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;)V", "fileOrDirectory", "mustExist", "commonDeleteRecursively", "followSymlinks", "Lzm/i;", "commonListRecursively", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;Z)Lzm/i;", "symlinkTarget", "(Lcom/applovin/shadow/okio/FileSystem;Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Path;", "Lzm/k;", "fileSystem", "Lxj/j;", "stack", "postorder", "collectRecursively", "(Lzm/k;Ljava/lang/Object;Lxj/j;Ljava/lang/Object;ZZLak/f;)Ljava/lang/Object;", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FileSystem {

    /* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.applovin.shadow.okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, TsExtractor.TS_STREAM_TYPE_E_AC3, 145}, m = "collectRecursively")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzm/k;", "Lcom/applovin/shadow/okio/Path;", "Lwj/r;", "<anonymous>", "(Lzm/k;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
    public static final class C02331 extends h implements jk.c {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ com.applovin.shadow.okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02331(Path path, com.applovin.shadow.okio.FileSystem fileSystem, boolean z10, f fVar) {
            super(2, fVar);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z10;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            C02331 c02331 = new C02331(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, fVar);
            c02331.L$0 = obj;
            return c02331;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0047  */
        /* JADX WARN: Code duplicated, block: B:13:0x0064 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0062 -> B:14:0x0065). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // ck.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 1
                if (r0 == 0) goto L21
                if (r0 != r1) goto L19
                java.lang.Object r0 = r10.L$2
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r2 = r10.L$1
                xj.j r2 = (xj.j) r2
                java.lang.Object r3 = r10.L$0
                zm.k r3 = (zm.k) r3
                t9.e.z(r11)
                r9 = r10
                r5 = r2
                goto L65
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L21:
                t9.e.z(r11)
                java.lang.Object r11 = r10.L$0
                zm.k r11 = (zm.k) r11
                xj.j r0 = new xj.j
                r0.<init>()
                com.applovin.shadow.okio.Path r2 = r10.$dir
                r0.addLast(r2)
                com.applovin.shadow.okio.FileSystem r2 = r10.$this_commonListRecursively
                com.applovin.shadow.okio.Path r3 = r10.$dir
                java.util.List r2 = r2.list(r3)
                java.util.Iterator r2 = r2.iterator()
                r3 = r11
                r5 = r0
                r0 = r2
            L41:
                boolean r11 = r0.hasNext()
                if (r11 == 0) goto L67
                java.lang.Object r11 = r0.next()
                r6 = r11
                com.applovin.shadow.okio.Path r6 = (com.applovin.shadow.okio.Path) r6
                com.applovin.shadow.okio.FileSystem r4 = r10.$this_commonListRecursively
                boolean r7 = r10.$followSymlinks
                r10.L$0 = r3
                r10.L$1 = r5
                r10.L$2 = r0
                r10.label = r1
                r8 = 0
                r9 = r10
                java.lang.Object r10 = com.applovin.shadow.okio.internal.FileSystem.collectRecursively(r3, r4, r5, r6, r7, r8, r9)
                bk.a r11 = bk.a.f5708a
                if (r10 != r11) goto L65
                return r11
            L65:
                r10 = r9
                goto L41
            L67:
                wj.r r10 = wj.r.f53297a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.C02331.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // jk.c
        public final Object invoke(k kVar, f fVar) {
            return ((C02331) create(kVar, fVar)).invokeSuspend(r.f53297a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ec A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #2 {all -> 0x012b, blocks: (B:47:0x00e6, B:49:0x00ec, B:46:0x00de), top: B:72:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0123 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object collectRecursively(zm.k r16, com.applovin.shadow.okio.FileSystem r17, xj.j r18, com.applovin.shadow.okio.Path r19, boolean r20, boolean r21, ak.f r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.collectRecursively(zm.k, com.applovin.shadow.okio.FileSystem, xj.j, com.applovin.shadow.okio.Path, boolean, boolean, ak.f):java.lang.Object");
    }

    public static final void commonCopy(com.applovin.shadow.okio.FileSystem fileSystem, Path source, Path target) throws IOException {
        Long lValueOf;
        Throwable th2;
        Long lValueOf2;
        n.f(fileSystem, "<this>");
        n.f(source, "source");
        n.f(target, "target");
        Source source2 = fileSystem.source(source);
        Throwable th3 = null;
        try {
            BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(target));
            try {
                lValueOf2 = Long.valueOf(bufferedSinkBuffer.writeAll(source2));
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                th2 = null;
            } catch (Throwable th5) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th6) {
                        i0.c(th5, th6);
                    }
                }
                th2 = th5;
                lValueOf2 = null;
            }
            if (th2 != null) {
                throw th2;
            }
            n.c(lValueOf2);
            lValueOf = Long.valueOf(lValueOf2.longValue());
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th7) {
                    th3 = th7;
                }
            }
            if (th3 != null) {
                throw th3;
            }
            n.c(lValueOf);
        } catch (Throwable th8) {
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th9) {
                    i0.c(th8, th9);
                }
            }
            th3 = th8;
            lValueOf = null;
        }
    }

    public static final void commonCreateDirectories(com.applovin.shadow.okio.FileSystem fileSystem, Path dir, boolean z10) throws IOException {
        n.f(fileSystem, "<this>");
        n.f(dir, "dir");
        j jVar = new j();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            jVar.addFirst(pathParent);
        }
        if (z10 && jVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = jVar.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path fileOrDirectory, boolean z10) throws IOException {
        n.f(fileSystem, "<this>");
        n.f(fileOrDirectory, "fileOrDirectory");
        zm.j jVarY = b.y(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null));
        while (jVarY.hasNext()) {
            fileSystem.delete((Path) jVarY.next(), z10 && !jVarY.hasNext());
        }
    }

    public static final boolean commonExists(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        n.f(fileSystem, "<this>");
        n.f(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final i commonListRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path dir, boolean z10) throws IOException {
        n.f(fileSystem, "<this>");
        n.f(dir, "dir");
        return new an.r(new C02331(dir, fileSystem, z10, null));
    }

    public static final FileMetadata commonMetadata(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        n.f(fileSystem, "<this>");
        n.f(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException(ca.l(path, "no such file: "));
    }

    public static final Path symlinkTarget(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        n.f(fileSystem, "<this>");
        n.f(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        n.c(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
