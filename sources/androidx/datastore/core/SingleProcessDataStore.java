package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4748uQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2854Wg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3013ah;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3086bY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4660tQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4706tv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2828Vg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4397qQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WX;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessDataStore<T> implements DataStore<T> {
    public static final Companion Companion = new Companion(null);

    @GuardedBy("activeFilesLock")
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final String SCRATCH_SUFFIX;
    private final SimpleActor<Message<T>> actor;
    private final CorruptionHandler<T> corruptionHandler;
    private final InterfaceC4443qv data;
    private final InterfaceC4309pQ downstreamFlow;
    private final InterfaceC3069bH file$delegate;
    private List<? extends InterfaceC3567gx> initTasks;
    private final InterfaceC2714Qw produceFile;
    private final InterfaceC4514rk scope;
    private final Serializer<T> serializer;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core() {
            return SingleProcessDataStore.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core() {
            return SingleProcessDataStore.activeFilesLock;
        }
    }

    public static abstract class Message<T> {

        public static final class Read<T> extends Message<T> {
            private final State<T> lastState;

            public Read(State<T> state) {
                super(null);
                this.lastState = state;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            public State<T> getLastState() {
                return this.lastState;
            }
        }

        public static final class Update<T> extends Message<T> {
            private final InterfaceC2828Vg ack;
            private final InterfaceC3549gk callerContext;
            private final State<T> lastState;
            private final InterfaceC3567gx transform;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Update(InterfaceC3567gx interfaceC3567gx, InterfaceC2828Vg interfaceC2828Vg, State<T> state, InterfaceC3549gk interfaceC3549gk) {
                super(null);
                AbstractC2995aW.q(interfaceC3567gx, "transform");
                AbstractC2995aW.q(interfaceC2828Vg, "ack");
                AbstractC2995aW.q(interfaceC3549gk, "callerContext");
                this.transform = interfaceC3567gx;
                this.ack = interfaceC2828Vg;
                this.lastState = state;
                this.callerContext = interfaceC3549gk;
            }

            public final InterfaceC2828Vg getAck() {
                return this.ack;
            }

            public final InterfaceC3549gk getCallerContext() {
                return this.callerContext;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            public State<T> getLastState() {
                return this.lastState;
            }

            public final InterfaceC3567gx getTransform() {
                return this.transform;
            }
        }

        private Message() {
        }

        public /* synthetic */ Message(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public abstract State<T> getLastState();
    }

    public static final class UncloseableOutputStream extends OutputStream {
        private final FileOutputStream fileOutputStream;

        public UncloseableOutputStream(FileOutputStream fileOutputStream) {
            AbstractC2995aW.q(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.fileOutputStream.flush();
        }

        public final FileOutputStream getFileOutputStream() {
            return this.fileOutputStream;
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.fileOutputStream.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            AbstractC2995aW.q(bArr, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            this.fileOutputStream.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            AbstractC2995aW.q(bArr, "bytes");
            this.fileOutputStream.write(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$handleUpdate$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
            this.this$0 = singleProcessDataStore;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInit$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    public static final class C03201 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03201(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
            this.this$0 = singleProcessDataStore;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInit(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    public static final class C03211 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03211(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
            this.this$0 = singleProcessDataStore;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    public static final class C03221 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03221(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
            this.this$0 = singleProcessDataStore;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readData$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    public static final class C03231 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03231(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
            this.this$0 = singleProcessDataStore;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readData(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    public static final class C03241 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03241(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
            this.this$0 = singleProcessDataStore;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
    public static final class C03251 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03251(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
            this.this$0 = singleProcessDataStore;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.transformAndWrite(null, null, this);
        }
    }

    public SingleProcessDataStore(InterfaceC2714Qw interfaceC2714Qw, Serializer<T> serializer, List<? extends InterfaceC3567gx> list, CorruptionHandler<T> corruptionHandler, InterfaceC4514rk interfaceC4514rk) {
        AbstractC2995aW.q(interfaceC2714Qw, "produceFile");
        AbstractC2995aW.q(serializer, "serializer");
        AbstractC2995aW.q(list, "initTasksList");
        AbstractC2995aW.q(corruptionHandler, "corruptionHandler");
        AbstractC2995aW.q(interfaceC4514rk, "scope");
        this.produceFile = interfaceC2714Qw;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = interfaceC4514rk;
        this.data = new C4706tv(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.file$delegate = AbstractC2340Cl.I(new SingleProcessDataStore$file$2(this));
        this.downstreamFlow = AbstractC4995x90.a(UnInitialized.INSTANCE);
        this.initTasks = AbstractC2853Wf.u0(list);
        this.actor = new SimpleActor<>(interfaceC4514rk, new SingleProcessDataStore$actor$1(this), SingleProcessDataStore$actor$2.INSTANCE, new SingleProcessDataStore$actor$3(this, null));
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(AbstractC2995aW.v0(file, "Unable to create parent directories of "));
        }
    }

    private static /* synthetic */ void getDownstreamFlow$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile() {
        return (File) this.file$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleRead(Message.Read<T> read, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, InvocationTargetException {
        Object andInitOrPropagateFailure;
        State<T> state = (State) ((C4907w90) this.downstreamFlow).getValue();
        boolean z = state instanceof Data;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (!z) {
            if (state instanceof ReadException) {
                return (state == read.getLastState() && (andInitOrPropagateFailure = readAndInitOrPropagateFailure(interfaceC2857Wj)) == EnumC4602sk.f4993a) ? andInitOrPropagateFailure : c5033xf0;
            }
            if (AbstractC2995aW.i(state, UnInitialized.INSTANCE)) {
                Object andInitOrPropagateFailure2 = readAndInitOrPropagateFailure(interfaceC2857Wj);
                return andInitOrPropagateFailure2 == EnumC4602sk.f4993a ? andInitOrPropagateFailure2 : c5033xf0;
            }
            if (state instanceof Final) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return c5033xf0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object handleUpdate(Message.Update<T> update, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, InvocationTargetException {
        AnonymousClass1 anonymousClass1;
        InterfaceC2828Vg interfaceC2828Vg;
        SingleProcessDataStore<T> singleProcessDataStore;
        InterfaceC2828Vg ack;
        Message.Update<T> update2;
        Object objTransformAndWrite;
        Object obj;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, interfaceC2857Wj);
        }
        Object objV = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            try {
                if (i2 == 1) {
                    interfaceC2828Vg = (InterfaceC2828Vg) anonymousClass1.L$0;
                } else if (i2 == 2) {
                    InterfaceC2828Vg interfaceC2828Vg2 = (InterfaceC2828Vg) anonymousClass1.L$2;
                    singleProcessDataStore = (SingleProcessDataStore) anonymousClass1.L$1;
                    Message.Update<T> update3 = (Message.Update) anonymousClass1.L$0;
                    AbstractC3375el.b0(objV);
                    ack = interfaceC2828Vg2;
                    update2 = update3;
                    InterfaceC3567gx transform = update2.getTransform();
                    InterfaceC3549gk callerContext = update2.getCallerContext();
                    anonymousClass1.L$0 = ack;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.label = 3;
                    objTransformAndWrite = singleProcessDataStore.transformAndWrite(transform, callerContext, anonymousClass1);
                    if (objTransformAndWrite == enumC4602sk) {
                        return enumC4602sk;
                    }
                    InterfaceC2828Vg interfaceC2828Vg3 = ack;
                    objV = objTransformAndWrite;
                    obj = interfaceC2828Vg3;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2828Vg = (InterfaceC2828Vg) anonymousClass1.L$0;
                }
                AbstractC3375el.b0(objV);
                obj = interfaceC2828Vg;
            } catch (Throwable th) {
                th = th;
                objV = AbstractC3375el.v(th);
                obj = update;
            }
        } else {
            AbstractC3375el.b0(objV);
            ack = update.getAck();
            try {
                State<T> state = (State) ((C4907w90) this.downstreamFlow).getValue();
                if (state instanceof Data) {
                    InterfaceC3567gx transform2 = update.getTransform();
                    InterfaceC3549gk callerContext2 = update.getCallerContext();
                    anonymousClass1.L$0 = ack;
                    anonymousClass1.label = 1;
                    objTransformAndWrite = transformAndWrite(transform2, callerContext2, anonymousClass1);
                    if (objTransformAndWrite == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    if (!(state instanceof ReadException) && !(state instanceof UnInitialized)) {
                        if (state instanceof Final) {
                            throw ((Final) state).getFinalException();
                        }
                        throw new C3770jF(7, 0);
                    }
                    if (state != update.getLastState()) {
                        throw ((ReadException) state).getReadException();
                    }
                    anonymousClass1.L$0 = update;
                    anonymousClass1.L$1 = this;
                    anonymousClass1.L$2 = ack;
                    anonymousClass1.label = 2;
                    if (readAndInitOrPropagateAndThrowFailure(anonymousClass1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    singleProcessDataStore = this;
                    update2 = update;
                    InterfaceC3567gx transform3 = update2.getTransform();
                    InterfaceC3549gk callerContext3 = update2.getCallerContext();
                    anonymousClass1.L$0 = ack;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.label = 3;
                    objTransformAndWrite = singleProcessDataStore.transformAndWrite(transform3, callerContext3, anonymousClass1);
                    if (objTransformAndWrite == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
                InterfaceC2828Vg interfaceC2828Vg4 = ack;
                objV = objTransformAndWrite;
                obj = interfaceC2828Vg4;
            } catch (Throwable th2) {
                th = th2;
                update = (Message.Update<T>) ack;
                objV = AbstractC3375el.v(th);
                obj = update;
            }
        }
        Throwable thA = IZ.a(objV);
        C2854Wg c2854Wg = (C2854Wg) obj;
        if (thA == null) {
            c2854Wg.S(objV);
        } else {
            c2854Wg.getClass();
            c2854Wg.S(new C3013ah(false, thA));
        }
        return C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:41:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0120  */
    /* JADX WARN: Code duplicated, block: B:46:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:33:0x00e0->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readAndInit(InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, IOException, InvocationTargetException {
        C03201 c03201;
        InterfaceC4397qQ interfaceC4397qQA;
        C3086bY c3086bY;
        SingleProcessDataStore<T> singleProcessDataStore;
        C3086bY c3086bY2;
        SingleProcessDataStore<T> singleProcessDataStore2;
        C3086bY c3086bY3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator<T> it;
        InterfaceC4397qQ interfaceC4397qQ;
        WX wx;
        WX wx2;
        SingleProcessDataStore<T> singleProcessDataStore3;
        C4660tQ c4660tQ;
        InterfaceC4397qQ interfaceC4397qQ2;
        C3086bY c3086bY4;
        InterfaceC3567gx interfaceC3567gx;
        Object obj;
        int iHashCode;
        if (interfaceC2857Wj instanceof C03201) {
            c03201 = (C03201) interfaceC2857Wj;
            int i = c03201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03201.label = i - Integer.MIN_VALUE;
            } else {
                c03201 = new C03201(this, interfaceC2857Wj);
            }
        } else {
            c03201 = new C03201(this, interfaceC2857Wj);
        }
        Object dataOrHandleCorruption = c03201.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c03201.label;
        if (i2 != 0) {
            if (i2 == 1) {
                c3086bY = (C3086bY) c03201.L$3;
                c3086bY2 = (C3086bY) c03201.L$2;
                interfaceC4397qQA = (InterfaceC4397qQ) c03201.L$1;
                singleProcessDataStore = (SingleProcessDataStore) c03201.L$0;
                AbstractC3375el.b0(dataOrHandleCorruption);
            } else if (i2 == 2) {
                it = (Iterator) c03201.L$5;
                singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) c03201.L$4;
                wx = (WX) c03201.L$3;
                c3086bY3 = (C3086bY) c03201.L$2;
                interfaceC4397qQ = (InterfaceC4397qQ) c03201.L$1;
                singleProcessDataStore2 = (SingleProcessDataStore) c03201.L$0;
                AbstractC3375el.b0(dataOrHandleCorruption);
                while (it.hasNext()) {
                    interfaceC3567gx = (InterfaceC3567gx) it.next();
                    c03201.L$0 = singleProcessDataStore2;
                    c03201.L$1 = interfaceC4397qQ;
                    c03201.L$2 = c3086bY3;
                    c03201.L$3 = wx;
                    c03201.L$4 = singleProcessDataStore$readAndInit$api$1;
                    c03201.L$5 = it;
                    c03201.label = 2;
                    if (interfaceC3567gx.invoke(singleProcessDataStore$readAndInit$api$1, c03201) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
                wx2 = wx;
                c3086bY2 = c3086bY3;
                interfaceC4397qQA = interfaceC4397qQ;
                singleProcessDataStore3 = singleProcessDataStore2;
                singleProcessDataStore3.initTasks = null;
                c03201.L$0 = singleProcessDataStore3;
                c03201.L$1 = c3086bY2;
                c03201.L$2 = wx2;
                c03201.L$3 = interfaceC4397qQA;
                c03201.L$4 = null;
                c03201.L$5 = null;
                c03201.label = 3;
                c4660tQ = (C4660tQ) interfaceC4397qQA;
                if (c4660tQ.d(null, c03201) == enumC4602sk) {
                    return enumC4602sk;
                }
                interfaceC4397qQ2 = c4660tQ;
                c3086bY4 = c3086bY2;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4397qQ2 = (InterfaceC4397qQ) c03201.L$3;
                wx2 = (WX) c03201.L$2;
                c3086bY4 = (C3086bY) c03201.L$1;
                singleProcessDataStore3 = (SingleProcessDataStore) c03201.L$0;
                AbstractC3375el.b0(dataOrHandleCorruption);
            }
            try {
                wx2.f3924a = true;
                ((C4660tQ) interfaceC4397qQ2).e(null);
                InterfaceC4309pQ interfaceC4309pQ = singleProcessDataStore3.downstreamFlow;
                obj = c3086bY4.f4172a;
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                ((C4907w90) interfaceC4309pQ).i(new Data(obj, iHashCode));
                return C5033xf0.f5238a;
            } catch (Throwable th) {
                ((C4660tQ) interfaceC4397qQ2).e(null);
                throw th;
            }
        }
        AbstractC3375el.b0(dataOrHandleCorruption);
        if (!AbstractC2995aW.i(((C4907w90) this.downstreamFlow).getValue(), UnInitialized.INSTANCE) && !(((C4907w90) this.downstreamFlow).getValue() instanceof ReadException)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        interfaceC4397qQA = AbstractC4748uQ.a();
        c3086bY = new C3086bY();
        c03201.L$0 = this;
        c03201.L$1 = interfaceC4397qQA;
        c03201.L$2 = c3086bY;
        c03201.L$3 = c3086bY;
        c03201.label = 1;
        dataOrHandleCorruption = readDataOrHandleCorruption(c03201);
        if (dataOrHandleCorruption == enumC4602sk) {
            return enumC4602sk;
        }
        singleProcessDataStore = this;
        c3086bY2 = c3086bY;
        c3086bY.f4172a = dataOrHandleCorruption;
        WX wx3 = new WX();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$2 = new SingleProcessDataStore$readAndInit$api$1(interfaceC4397qQA, wx3, c3086bY2, singleProcessDataStore);
        List<? extends InterfaceC3567gx> list = singleProcessDataStore.initTasks;
        if (list == null) {
            wx2 = wx3;
            singleProcessDataStore3 = singleProcessDataStore;
        } else {
            singleProcessDataStore2 = singleProcessDataStore;
            c3086bY3 = c3086bY2;
            singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$2;
            it = list.iterator();
            interfaceC4397qQ = interfaceC4397qQA;
            wx = wx3;
            while (it.hasNext()) {
                interfaceC3567gx = (InterfaceC3567gx) it.next();
                c03201.L$0 = singleProcessDataStore2;
                c03201.L$1 = interfaceC4397qQ;
                c03201.L$2 = c3086bY3;
                c03201.L$3 = wx;
                c03201.L$4 = singleProcessDataStore$readAndInit$api$1;
                c03201.L$5 = it;
                c03201.label = 2;
                if (interfaceC3567gx.invoke(singleProcessDataStore$readAndInit$api$1, c03201) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
            wx2 = wx;
            c3086bY2 = c3086bY3;
            interfaceC4397qQA = interfaceC4397qQ;
            singleProcessDataStore3 = singleProcessDataStore2;
        }
        singleProcessDataStore3.initTasks = null;
        c03201.L$0 = singleProcessDataStore3;
        c03201.L$1 = c3086bY2;
        c03201.L$2 = wx2;
        c03201.L$3 = interfaceC4397qQA;
        c03201.L$4 = null;
        c03201.L$5 = null;
        c03201.label = 3;
        c4660tQ = (C4660tQ) interfaceC4397qQA;
        if (c4660tQ.d(null, c03201) == enumC4602sk) {
            return enumC4602sk;
        }
        interfaceC4397qQ2 = c4660tQ;
        c3086bY4 = c3086bY2;
        wx2.f3924a = true;
        ((C4660tQ) interfaceC4397qQ2).e(null);
        InterfaceC4309pQ interfaceC4309pQ2 = singleProcessDataStore3.downstreamFlow;
        obj = c3086bY4.f4172a;
        if (obj != null) {
            iHashCode = obj.hashCode();
        } else {
            iHashCode = 0;
        }
        ((C4907w90) interfaceC4309pQ2).i(new Data(obj, iHashCode));
        return C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readAndInitOrPropagateAndThrowFailure(InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C03211 c03211;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (interfaceC2857Wj instanceof C03211) {
            c03211 = (C03211) interfaceC2857Wj;
            int i = c03211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03211.label = i - Integer.MIN_VALUE;
            } else {
                c03211 = new C03211(this, interfaceC2857Wj);
            }
        } else {
            c03211 = new C03211(this, interfaceC2857Wj);
        }
        Object obj = c03211.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c03211.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = (SingleProcessDataStore) c03211.L$0;
            try {
                AbstractC3375el.b0(obj);
                return C5033xf0.f5238a;
            } catch (Throwable th) {
                th = th;
                ((C4907w90) singleProcessDataStore.downstreamFlow).i(new ReadException(th));
                throw th;
            }
        }
        AbstractC3375el.b0(obj);
        try {
            c03211.L$0 = this;
            c03211.label = 1;
            if (readAndInit(c03211) == enumC4602sk) {
                return enumC4602sk;
            }
            return C5033xf0.f5238a;
        } catch (Throwable th2) {
            th = th2;
            singleProcessDataStore = this;
            ((C4907w90) singleProcessDataStore.downstreamFlow).i(new ReadException(th));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readAndInitOrPropagateFailure(InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, InvocationTargetException {
        C03221 c03221;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (interfaceC2857Wj instanceof C03221) {
            c03221 = (C03221) interfaceC2857Wj;
            int i = c03221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03221.label = i - Integer.MIN_VALUE;
            } else {
                c03221 = new C03221(this, interfaceC2857Wj);
            }
        } else {
            c03221 = new C03221(this, interfaceC2857Wj);
        }
        Object obj = c03221.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c03221.label;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            try {
                c03221.L$0 = this;
                c03221.label = 1;
                if (readAndInit(c03221) == enumC4602sk) {
                    return enumC4602sk;
                }
            } catch (Throwable th) {
                th = th;
                singleProcessDataStore = this;
                ((C4907w90) singleProcessDataStore.downstreamFlow).i(new ReadException(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = (SingleProcessDataStore) c03221.L$0;
            try {
                AbstractC3375el.b0(obj);
            } catch (Throwable th2) {
                th = th2;
                ((C4907w90) singleProcessDataStore.downstreamFlow).i(new ReadException(th));
            }
        }
        return C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wj] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final Object readData(InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, IOException, InvocationTargetException {
        ?? c03231;
        ?? fileInputStream;
        Throwable th;
        ?? r2;
        if (interfaceC2857Wj instanceof C03231) {
            C03231 c03232 = (C03231) interfaceC2857Wj;
            int i = c03232.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03232.label = i - Integer.MIN_VALUE;
                c03231 = c03232;
            } else {
                c03231 = new C03231(this, interfaceC2857Wj);
            }
        } else {
            c03231 = new C03231(this, interfaceC2857Wj);
        }
        Object from = c03231.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c03231.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) c03231.L$2;
                fileInputStream = (Closeable) c03231.L$1;
                c03231 = (SingleProcessDataStore) c03231.L$0;
                try {
                    AbstractC3375el.b0(from);
                    r2 = fileInputStream;
                    AbstractC3375el.n(r2, th);
                    return from;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        AbstractC3375el.n(fileInputStream, th);
                        throw th3;
                    }
                }
            }
            AbstractC3375el.b0(from);
            try {
                fileInputStream = new FileInputStream(getFile());
                try {
                    Serializer<T> serializer = this.serializer;
                    c03231.L$0 = this;
                    c03231.L$1 = fileInputStream;
                    c03231.L$2 = null;
                    c03231.label = 1;
                    from = serializer.readFrom(fileInputStream, c03231);
                    if (from == enumC4602sk) {
                        return enumC4602sk;
                    }
                    th = null;
                    r2 = fileInputStream;
                    AbstractC3375el.n(r2, th);
                    return from;
                } catch (Throwable th4) {
                    th = th4;
                    c03231 = this;
                    throw th;
                }
            } catch (FileNotFoundException e) {
                e = e;
                c03231 = this;
                if (c03231.getFile().exists()) {
                    throw e;
                }
                return c03231.serializer.getDefaultValue();
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readDataOrHandleCorruption(InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, IOException, InvocationTargetException {
        C03241 c03241;
        SingleProcessDataStore singleProcessDataStore;
        Object objHandleCorruption;
        CorruptionException corruptionException;
        SingleProcessDataStore singleProcessDataStore2;
        CorruptionException corruptionException2;
        if (interfaceC2857Wj instanceof C03241) {
            c03241 = (C03241) interfaceC2857Wj;
            int i = c03241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03241.label = i - Integer.MIN_VALUE;
            } else {
                c03241 = new C03241(this, interfaceC2857Wj);
            }
        } else {
            c03241 = new C03241(this, interfaceC2857Wj);
        }
        Object data = c03241.result;
        Object obj = EnumC4602sk.f4993a;
        int i2 = c03241.label;
        if (i2 == 0) {
            AbstractC3375el.b0(data);
            try {
                c03241.L$0 = this;
                c03241.label = 1;
                data = readData(c03241);
                return data == obj ? obj : data;
            } catch (CorruptionException e) {
                e = e;
                singleProcessDataStore = this;
                CorruptionHandler<T> corruptionHandler = singleProcessDataStore.corruptionHandler;
                c03241.L$0 = singleProcessDataStore;
                c03241.L$1 = e;
                c03241.label = 2;
                objHandleCorruption = corruptionHandler.handleCorruption(e, c03241);
                if (objHandleCorruption == obj) {
                    return obj;
                }
                SingleProcessDataStore singleProcessDataStore3 = singleProcessDataStore;
                corruptionException = e;
                data = objHandleCorruption;
                singleProcessDataStore2 = singleProcessDataStore3;
                c03241.L$0 = corruptionException;
                c03241.L$1 = data;
                c03241.label = 3;
                if (singleProcessDataStore2.writeData$datastore_core(data, c03241) == obj) {
                    return obj;
                }
                return data;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                corruptionException = (CorruptionException) c03241.L$1;
                SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) c03241.L$0;
                AbstractC3375el.b0(data);
                singleProcessDataStore2 = singleProcessDataStore4;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = c03241.L$1;
                corruptionException2 = (CorruptionException) c03241.L$0;
                try {
                    AbstractC3375el.b0(data);
                    return obj2;
                } catch (IOException e2) {
                    e = e2;
                }
            }
            AbstractC2995aW.h(corruptionException2, e);
            throw corruptionException2;
        }
        singleProcessDataStore = (SingleProcessDataStore) c03241.L$0;
        try {
            AbstractC3375el.b0(data);
        } catch (CorruptionException e3) {
            e = e3;
            CorruptionHandler<T> corruptionHandler2 = singleProcessDataStore.corruptionHandler;
            c03241.L$0 = singleProcessDataStore;
            c03241.L$1 = e;
            c03241.label = 2;
            objHandleCorruption = corruptionHandler2.handleCorruption(e, c03241);
            if (objHandleCorruption == obj) {
                return obj;
            }
            SingleProcessDataStore singleProcessDataStore5 = singleProcessDataStore;
            corruptionException = e;
            data = objHandleCorruption;
            singleProcessDataStore2 = singleProcessDataStore5;
            c03241.L$0 = corruptionException;
            c03241.L$1 = data;
            c03241.label = 3;
            if (singleProcessDataStore2.writeData$datastore_core(data, c03241) == obj) {
                return obj;
            }
            return data;
        }
        try {
            c03241.L$0 = corruptionException;
            c03241.L$1 = data;
            c03241.label = 3;
            if (singleProcessDataStore2.writeData$datastore_core(data, c03241) == obj) {
                return obj;
            }
            return data;
        } catch (IOException e4) {
            e = e4;
            corruptionException2 = corruptionException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object transformAndWrite(InterfaceC3567gx interfaceC3567gx, InterfaceC3549gk interfaceC3549gk, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, InvocationTargetException {
        C03251 c03251;
        Data data;
        Object obj;
        SingleProcessDataStore singleProcessDataStore;
        SingleProcessDataStore singleProcessDataStore2;
        int iHashCode;
        if (interfaceC2857Wj instanceof C03251) {
            c03251 = (C03251) interfaceC2857Wj;
            int i = c03251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03251.label = i - Integer.MIN_VALUE;
            } else {
                c03251 = new C03251(this, interfaceC2857Wj);
            }
        } else {
            c03251 = new C03251(this, interfaceC2857Wj);
        }
        Object obj2 = c03251.result;
        Object obj3 = EnumC4602sk.f4993a;
        int i2 = c03251.label;
        if (i2 != 0) {
            if (i2 == 1) {
                obj = c03251.L$2;
                data = (Data) c03251.L$1;
                SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) c03251.L$0;
                AbstractC3375el.b0(obj2);
                singleProcessDataStore = singleProcessDataStore3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c03251.L$1;
                SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) c03251.L$0;
                AbstractC3375el.b0(obj2);
                singleProcessDataStore2 = singleProcessDataStore4;
            }
            InterfaceC4309pQ interfaceC4309pQ = singleProcessDataStore2.downstreamFlow;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            ((C4907w90) interfaceC4309pQ).i(new Data(obj, iHashCode));
            return obj;
        }
        AbstractC3375el.b0(obj2);
        Data data2 = (Data) ((C4907w90) this.downstreamFlow).getValue();
        data2.checkHashCode();
        Object value = data2.getValue();
        SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(interfaceC3567gx, value, null);
        c03251.L$0 = this;
        c03251.L$1 = data2;
        c03251.L$2 = value;
        c03251.label = 1;
        Object objX = WD.X(singleProcessDataStore$transformAndWrite$newData$1, interfaceC3549gk, c03251);
        if (objX == obj3) {
            return obj3;
        }
        data = data2;
        obj2 = objX;
        obj = value;
        singleProcessDataStore = this;
        data.checkHashCode();
        if (!AbstractC2995aW.i(obj, obj2)) {
            c03251.L$0 = singleProcessDataStore;
            c03251.L$1 = obj2;
            c03251.L$2 = null;
            c03251.label = 2;
            if (singleProcessDataStore.writeData$datastore_core(obj2, c03251) == obj3) {
                return obj3;
            }
            obj = obj2;
            singleProcessDataStore2 = singleProcessDataStore;
            InterfaceC4309pQ interfaceC4309pQ2 = singleProcessDataStore2.downstreamFlow;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            ((C4907w90) interfaceC4309pQ2).i(new Data(obj, iHashCode));
        }
        return obj;
    }

    @Override // androidx.datastore.core.DataStore
    public InterfaceC4443qv getData() {
        return this.data;
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        C2854Wg c2854WgB = AbstractC3375el.b();
        this.actor.offer(new Message.Update(interfaceC3567gx, c2854WgB, (State) ((C4907w90) this.downstreamFlow).getValue(), interfaceC2857Wj.getContext()));
        return c2854WgB.z(interfaceC2857Wj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.FileOutputStream] */
    public final Object writeData$datastore_core(T t, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, IOException, InvocationTargetException {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        ?? file;
        ?? fileOutputStream;
        SingleProcessDataStore<T> singleProcessDataStore;
        ?? r9;
        Throwable th;
        if (interfaceC2857Wj instanceof SingleProcessDataStore$writeData$1) {
            singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) interfaceC2857Wj;
            int i = singleProcessDataStore$writeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$writeData$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, interfaceC2857Wj);
            }
        } else {
            singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, interfaceC2857Wj);
        }
        Object obj = singleProcessDataStore$writeData$1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = singleProcessDataStore$writeData$1.label;
        ?? r4 = 1;
        try {
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                createParentDirectories(getFile());
                file = new File(AbstractC2995aW.v0(this.SCRATCH_SUFFIX, getFile().getAbsolutePath()));
                try {
                    fileOutputStream = new FileOutputStream((File) file);
                    try {
                        Serializer<T> serializer = this.serializer;
                        UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream);
                        singleProcessDataStore$writeData$1.L$0 = this;
                        singleProcessDataStore$writeData$1.L$1 = file;
                        singleProcessDataStore$writeData$1.L$2 = fileOutputStream;
                        singleProcessDataStore$writeData$1.L$3 = null;
                        singleProcessDataStore$writeData$1.L$4 = fileOutputStream;
                        singleProcessDataStore$writeData$1.label = 1;
                        if (serializer.writeTo(t, uncloseableOutputStream, singleProcessDataStore$writeData$1) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        singleProcessDataStore = this;
                        r4 = file;
                        r9 = fileOutputStream;
                        th = null;
                        fileOutputStream = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        r4 = file;
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FileOutputStream fileOutputStream2 = (FileOutputStream) singleProcessDataStore$writeData$1.L$4;
                th = (Throwable) singleProcessDataStore$writeData$1.L$3;
                fileOutputStream = (Closeable) singleProcessDataStore$writeData$1.L$2;
                r4 = (File) singleProcessDataStore$writeData$1.L$1;
                singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.L$0;
                try {
                    AbstractC3375el.b0(obj);
                    fileOutputStream = fileOutputStream;
                    r4 = r4;
                    r9 = fileOutputStream2;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        AbstractC3375el.n(fileOutputStream, th);
                        throw th4;
                    }
                }
            }
            r9.getFD().sync();
            AbstractC3375el.n(fileOutputStream, th);
            if (r4.renameTo(singleProcessDataStore.getFile())) {
                return C5033xf0.f5238a;
            }
            throw new IOException("Unable to rename " + r4 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e2) {
            e = e2;
            file = r4;
        }
    }

    public SingleProcessDataStore(InterfaceC2714Qw interfaceC2714Qw, Serializer serializer, List list, CorruptionHandler corruptionHandler, InterfaceC4514rk interfaceC4514rk, int i, AbstractC2471Hm abstractC2471Hm) {
        this(interfaceC2714Qw, serializer, (i & 4) != 0 ? C2812Uq.f3846a : list, (i & 8) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i & 16) != 0 ? WD.a(AbstractC4437qp.b.plus(AbstractC3375el.c())) : interfaceC4514rk);
    }
}
