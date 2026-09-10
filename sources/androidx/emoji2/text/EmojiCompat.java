package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompat {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f4961i = new Object();
    public static volatile EmojiCompat j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f4962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArraySet f4963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f4964c;
    public final Handler d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CompatInternal19 f4965e;
    public final MetadataRepoLoader f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GlyphChecker f4966h;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CodepointSequenceMatchResult {
    }

    public static class CompatInternal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmojiCompat f4967a;

        public CompatInternal(EmojiCompat emojiCompat) {
            this.f4967a = emojiCompat;
        }
    }

    public static final class CompatInternal19 extends CompatInternal {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile EmojiProcessor f4968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile MetadataRepo f4969c;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompat$CompatInternal19$1, reason: invalid class name */
        class AnonymousClass1 extends MetadataRepoLoaderCallback {
            public AnonymousClass1() {
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public final void a(Throwable th) {
                CompatInternal19.this.f4967a.f(th);
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public final void b(MetadataRepo metadataRepo) {
                CompatInternal19 compatInternal19 = CompatInternal19.this;
                compatInternal19.f4969c = metadataRepo;
                compatInternal19.f4968b = new EmojiProcessor(compatInternal19.f4969c, new SpanFactory(), compatInternal19.f4967a.f4966h);
                EmojiCompat emojiCompat = compatInternal19.f4967a;
                emojiCompat.getClass();
                ArrayList arrayList = new ArrayList();
                emojiCompat.f4962a.writeLock().lock();
                try {
                    emojiCompat.f4964c = 1;
                    arrayList.addAll(emojiCompat.f4963b);
                    emojiCompat.f4963b.clear();
                    emojiCompat.f4962a.writeLock().unlock();
                    emojiCompat.d.post(new ListenerDispatcher(arrayList, emojiCompat.f4964c, null));
                } catch (Throwable th) {
                    emojiCompat.f4962a.writeLock().unlock();
                    throw th;
                }
            }
        }
    }

    public static abstract class Config {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MetadataRepoLoader f4971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4972b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GlyphChecker f4973c = new DefaultGlyphChecker();

        public Config(MetadataRepoLoader metadataRepoLoader) {
            this.f4971a = metadataRepoLoader;
        }
    }

    public interface GlyphChecker {
    }

    public static class ListenerDispatcher implements Runnable {
        public final ArrayList X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f4974Y;

        public ListenerDispatcher(List list, int i2, Throwable th) {
            Preconditions.d(list, "initCallbacks cannot be null");
            this.X = new ArrayList(list);
            this.f4974Y = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            int i2 = 0;
            if (this.f4974Y != 1) {
                while (i2 < size) {
                    ((InitCallback) arrayList.get(i2)).a();
                    i2++;
                }
            } else {
                while (i2 < size) {
                    ((InitCallback) arrayList.get(i2)).b();
                    i2++;
                }
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        void a(MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    public static abstract class MetadataRepoLoaderCallback {
        public abstract void a(Throwable th);

        public abstract void b(MetadataRepo metadataRepo);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ReplaceStrategy {
    }

    public static class SpanFactory {
    }

    public EmojiCompat(Config config) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4962a = reentrantReadWriteLock;
        this.f4964c = 3;
        MetadataRepoLoader metadataRepoLoader = config.f4971a;
        this.f = metadataRepoLoader;
        int i2 = config.f4972b;
        this.g = i2;
        this.f4966h = config.f4973c;
        this.d = new Handler(Looper.getMainLooper());
        this.f4963b = new ArraySet(0);
        CompatInternal19 compatInternal19 = new CompatInternal19(this);
        this.f4965e = compatInternal19;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f4964c = 0;
            } catch (Throwable th) {
                this.f4962a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                metadataRepoLoader.a(compatInternal19.new AnonymousClass1());
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static EmojiCompat a() {
        EmojiCompat emojiCompat;
        synchronized (f4961i) {
            try {
                emojiCompat = j;
                if (!(emojiCompat != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return emojiCompat;
    }

    public static boolean c(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
        int iMin;
        if (editable != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z2) {
                    int iMax = Math.max(i2, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z3) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z3) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z3 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i3, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z4 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z4) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z4) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z4 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i2, 0);
                    iMin = Math.min(selectionEnd + i3, editable.length());
                }
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, iMin, EmojiSpan.class);
                if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                    for (EmojiSpan emojiSpan : emojiSpanArr) {
                        int spanStart = editable.getSpanStart(emojiSpan);
                        int spanEnd = editable.getSpanEnd(emojiSpan);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    InputConnectionWrapper inputConnectionWrapper = (InputConnectionWrapper) inputConnection;
                    inputConnectionWrapper.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    inputConnectionWrapper.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(Editable editable, int i2, KeyEvent keyEvent) {
        boolean zA;
        if (i2 != 67) {
            zA = i2 != 112 ? false : EmojiProcessor.a(editable, keyEvent, true);
        } else {
            zA = EmojiProcessor.a(editable, keyEvent, false);
        }
        if (!zA) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public final int b() {
        this.f4962a.readLock().lock();
        try {
            return this.f4964c;
        } finally {
            this.f4962a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f4962a.writeLock().lock();
        try {
            if (this.f4964c == 0) {
                this.f4962a.writeLock().unlock();
                return;
            }
            this.f4964c = 0;
            this.f4962a.writeLock().unlock();
            CompatInternal19 compatInternal19 = this.f4965e;
            EmojiCompat emojiCompat = compatInternal19.f4967a;
            try {
                emojiCompat.f.a(compatInternal19.new AnonymousClass1());
            } catch (Throwable th) {
                emojiCompat.f(th);
            }
        } catch (Throwable th2) {
            this.f4962a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4962a.writeLock().lock();
        try {
            this.f4964c = 2;
            arrayList.addAll(this.f4963b);
            this.f4963b.clear();
            this.f4962a.writeLock().unlock();
            this.d.post(new ListenerDispatcher(arrayList, this.f4964c, th));
        } catch (Throwable th2) {
            this.f4962a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0094 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:44:0x0083, B:46:0x008d, B:48:0x0090, B:50:0x0094, B:52:0x00a4, B:53:0x00a7, B:55:0x00b4, B:58:0x00bc, B:63:0x00d7, B:69:0x00e3, B:72:0x00ef, B:73:0x00f9, B:74:0x0108, B:76:0x010f, B:77:0x0114, B:79:0x011f, B:81:0x0126, B:83:0x012a, B:85:0x0130, B:87:0x0134, B:90:0x013c, B:93:0x0148, B:94:0x014d, B:96:0x015b, B:42:0x0079), top: B:115:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:44:0x0083, B:46:0x008d, B:48:0x0090, B:50:0x0094, B:52:0x00a4, B:53:0x00a7, B:55:0x00b4, B:58:0x00bc, B:63:0x00d7, B:69:0x00e3, B:72:0x00ef, B:73:0x00f9, B:74:0x0108, B:76:0x010f, B:77:0x0114, B:79:0x011f, B:81:0x0126, B:83:0x012a, B:85:0x0130, B:87:0x0134, B:90:0x013c, B:93:0x0148, B:94:0x014d, B:96:0x015b, B:42:0x0079), top: B:115:0x005a }] */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(Unknown Source)
    	at java.base/java.util.HashMap.getNode(Unknown Source)
    	at java.base/java.util.HashMap.containsKey(Unknown Source)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x00d3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final java.lang.CharSequence g(java.lang.CharSequence r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiCompat.g(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void h(InitCallback initCallback) {
        Preconditions.d(initCallback, "initCallback cannot be null");
        this.f4962a.writeLock().lock();
        try {
            if (this.f4964c == 1 || this.f4964c == 2) {
                this.d.post(new ListenerDispatcher(Arrays.asList(initCallback), this.f4964c, null));
            } else {
                this.f4963b.add(initCallback);
            }
        } finally {
            this.f4962a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (b() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        CompatInternal19 compatInternal19 = this.f4965e;
        compatInternal19.getClass();
        Bundle bundle = editorInfo.extras;
        MetadataList metadataList = compatInternal19.f4969c.f4995a;
        int iA = metadataList.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? metadataList.f5017b.getInt(iA + metadataList.f5016a) : 0);
        Bundle bundle2 = editorInfo.extras;
        compatInternal19.f4967a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    public static abstract class InitCallback {
        public void b() {
        }

        public void a() {
        }
    }
}
