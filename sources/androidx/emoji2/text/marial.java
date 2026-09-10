package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import claque.impassible;
import hardpan.competently;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import monroe.monoploid;
import technofreak.cutely;

/* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
/* JADX INFO: loaded from: classes.dex */
public class marial extends dern.AbstractC0071dern {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final attabal f10011apical = new attabal();

    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    public static class attabal {
        public Typeface attabal(Context context, competently.saneness sanenessVar) throws PackageManager.NameNotFoundException {
            return competently.attabal(context, null, new competently.saneness[]{sanenessVar});
        }

        public void dern(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }

        public competently.attabal saneness(Context context, hardpan.marial marialVar) throws PackageManager.NameNotFoundException {
            return competently.saneness(context, null, marialVar);
        }
    }

    /* JADX INFO: compiled from: FontRequestEmojiCompatConfig.java */
    public static class saneness implements dern.impromptu {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f10012attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public Executor f10013beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public ThreadPoolExecutor f10014competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public Runnable f10015cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final attabal f10016dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public dern.taiyuan f10017impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Handler f10018marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final hardpan.marial f10019saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public ContentObserver f10020taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final Object f10021wireman = new Object();

        public saneness(Context context, hardpan.marial marialVar, attabal attabalVar) {
            cutely.impromptu(context, "Context cannot be null");
            cutely.impromptu(marialVar, "FontRequest cannot be null");
            this.f10012attabal = context.getApplicationContext();
            this.f10019saneness = marialVar;
            this.f10016dern = attabalVar;
        }

        @Override // androidx.emoji2.text.dern.impromptu
        public void attabal(dern.taiyuan taiyuanVar) {
            cutely.impromptu(taiyuanVar, "LoaderCallback cannot be null");
            synchronized (this.f10021wireman) {
                this.f10017impromptu = taiyuanVar;
            }
            wireman();
        }

        public void beachfront(Executor executor) {
            synchronized (this.f10021wireman) {
                this.f10013beachfront = executor;
            }
        }

        public void dern() {
            synchronized (this.f10021wireman) {
                try {
                    if (this.f10017impromptu == null) {
                        return;
                    }
                    try {
                        competently.saneness sanenessVarMarial = marial();
                        int iSaneness = sanenessVarMarial.saneness();
                        if (iSaneness == 2) {
                            synchronized (this.f10021wireman) {
                            }
                        }
                        if (iSaneness != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iSaneness + ")");
                        }
                        try {
                            impassible.attabal("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceAttabal = this.f10016dern.attabal(this.f10012attabal, sanenessVarMarial);
                            ByteBuffer byteBufferBeachfront = monoploid.beachfront(this.f10012attabal, null, sanenessVarMarial.wireman());
                            if (byteBufferBeachfront == null || typefaceAttabal == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            beachfront beachfrontVarSaneness = beachfront.saneness(typefaceAttabal, byteBufferBeachfront);
                            impassible.saneness();
                            synchronized (this.f10021wireman) {
                                try {
                                    dern.taiyuan taiyuanVar = this.f10017impromptu;
                                    if (taiyuanVar != null) {
                                        taiyuanVar.saneness(beachfrontVarSaneness);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            saneness();
                        } catch (Throwable th2) {
                            impassible.saneness();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.f10021wireman) {
                            try {
                                dern.taiyuan taiyuanVar2 = this.f10017impromptu;
                                if (taiyuanVar2 != null) {
                                    taiyuanVar2.attabal(th3);
                                }
                                saneness();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        public final competently.saneness marial() {
            try {
                competently.attabal attabalVarSaneness = this.f10016dern.saneness(this.f10012attabal, this.f10019saneness);
                if (attabalVarSaneness.marial() == 0) {
                    competently.saneness[] sanenessVarArrDern = attabalVarSaneness.dern();
                    if (sanenessVarArrDern == null || sanenessVarArrDern.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return sanenessVarArrDern[0];
                }
                throw new RuntimeException("fetchFonts failed (" + attabalVarSaneness.marial() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        public final void saneness() {
            synchronized (this.f10021wireman) {
                try {
                    this.f10017impromptu = null;
                    ContentObserver contentObserver = this.f10020taiyuan;
                    if (contentObserver != null) {
                        this.f10016dern.dern(this.f10012attabal, contentObserver);
                        this.f10020taiyuan = null;
                    }
                    Handler handler = this.f10018marial;
                    if (handler != null) {
                        handler.removeCallbacks(this.f10015cutely);
                    }
                    this.f10018marial = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f10014competently;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f10013beachfront = null;
                    this.f10014competently = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void wireman() {
            synchronized (this.f10021wireman) {
                try {
                    if (this.f10017impromptu == null) {
                        return;
                    }
                    if (this.f10013beachfront == null) {
                        ThreadPoolExecutor threadPoolExecutorSaneness = sakeen.dern.saneness("emojiCompat");
                        this.f10014competently = threadPoolExecutorSaneness;
                        this.f10013beachfront = threadPoolExecutorSaneness;
                    }
                    this.f10013beachfront.execute(new Runnable() { // from class: sakeen.competently
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37031kowloon.dern();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public marial(Context context, hardpan.marial marialVar) {
        super(new saneness(context, marialVar, f10011apical));
    }

    public marial dern(Executor executor) {
        ((saneness) attabal()).beachfront(executor);
        return this;
    }
}
