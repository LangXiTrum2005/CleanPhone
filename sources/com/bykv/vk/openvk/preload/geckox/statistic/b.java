package com.bykv.vk.openvk.preload.geckox.statistic;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.geckox.c.b.b.f;
import com.bykv.vk.openvk.preload.geckox.c.e;
import com.bykv.vk.openvk.preload.geckox.c.g;
import com.bykv.vk.openvk.preload.geckox.c.h;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static com.bykv.vk.openvk.preload.a.b.a a(final com.bykv.vk.openvk.preload.geckox.b bVar) {
        return new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.1
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.a(bVar2, dVar);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName().concat("onStart"), "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName().concat("onEnd"), "");
                    if ((dVar instanceof e) && (dVar.f() instanceof Map)) {
                        bVar.f().put(dVar.getClass().getSimpleName(), ((Map) dVar.f()).get("f36c832c8dbb162c49b46a7a6dd47fbd"));
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.c(bVar2, dVar);
                try {
                    c.a(bVar, a.a(dVar.b()));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName().concat("onException"), th.toString());
                    c.a(bVar, a.a(dVar.b()));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.b(bVar2, dVar, th);
                try {
                    bVar.f().put(dVar.getClass().getSimpleName().concat("onChainException"), th.toString());
                    c.a(bVar, a.a(dVar.b()));
                } catch (Throwable unused) {
                }
            }
        };
    }

    private static com.bykv.vk.openvk.preload.a.b.a b(final Context context) {
        return new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.5
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.a(bVar, dVar);
                Pair pair = (Pair) bVar.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                aVarA.d = ((Uri) pair.first).toString();
                aVarA.f13008n = com.bykv.vk.openvk.preload.geckox.utils.e.a(context);
                aVarA.f = SystemClock.uptimeMillis();
                aVarA.o = Long.valueOf(((UpdatePackage) pair.second).getPatch().getId());
                aVarA.f13009p = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                aVarA.f13003c = ((UpdatePackage) pair.second).getChannel();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar.b(h.class)).second).getChannel());
                aVarA.f13005h = true;
                aVarA.g = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th) {
                super.a(bVar, dVar, th);
                Pair pair = (Pair) bVar.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                String string = ((Uri) pair.first).toString();
                aVarA.f13005h = false;
                aVarA.g = SystemClock.uptimeMillis();
                aVarA.f13004e.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(string, th.getMessage()));
            }
        };
    }

    private static com.bykv.vk.openvk.preload.a.b.a a(final Context context) {
        return new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.4
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.a(bVar, dVar);
                Pair pair = (Pair) bVar.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                aVarA.t = ((Uri) pair.first).toString();
                aVarA.f13008n = com.bykv.vk.openvk.preload.geckox.utils.e.a(context);
                aVarA.v = SystemClock.uptimeMillis();
                aVarA.f13009p = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                aVarA.f13003c = ((UpdatePackage) pair.second).getChannel();
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getAccessKey())) {
                    aVarA.f13001a = ((UpdatePackage) pair.second).getAccessKey();
                }
                if (TextUtils.isEmpty(((UpdatePackage) pair.second).getGroupName())) {
                    return;
                }
                aVarA.f13002b = ((UpdatePackage) pair.second).getGroupName();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar.b(g.class)).second).getChannel());
                aVarA.f13012z = true;
                aVarA.f13011w = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th) {
                super.a(bVar, dVar, th);
                Pair pair = (Pair) bVar.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                String string = ((Uri) pair.first).toString();
                aVarA.f13012z = false;
                aVarA.f13011w = SystemClock.uptimeMillis();
                aVarA.f13010u.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(string, th.getMessage()));
            }
        };
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.a aVar, com.bykv.vk.openvk.preload.geckox.b bVar) {
        aVar.a(e.class, a(bVar));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.d.class, a(bVar));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.c.class, b(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.b.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f13006i = false;
                SystemClock.uptimeMillis();
                aVarA.q = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).f13006i = true;
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.d.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.j = false;
                SystemClock.uptimeMillis();
                aVarA.r = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).j = true;
                SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.j = false;
                aVarA.f13007l = SystemClock.uptimeMillis();
                aVarA.r = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.j = true;
                aVarA.f13007l = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.e.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.11
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.k = false;
                aVarA.s = th.getMessage();
                aVarA.m = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.k = true;
                aVarA.m = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.a.b.class, a(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.a.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.f12999A = false;
                aVarA.x = SystemClock.uptimeMillis();
                aVarA.C = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.f12999A = true;
                aVarA.x = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.a.c.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.10
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.f13000B = false;
                aVarA.y = SystemClock.uptimeMillis();
                aVarA.D = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.f13000B = true;
                aVarA.y = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.c.class, b(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.b.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.f13006i = false;
                SystemClock.uptimeMillis();
                aVarA.q = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).f13006i = true;
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.d.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.j = false;
                SystemClock.uptimeMillis();
                aVarA.r = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).j = true;
                SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.j = false;
                aVarA.f13007l = SystemClock.uptimeMillis();
                aVarA.r = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.j = true;
                aVarA.f13007l = SystemClock.uptimeMillis();
            }
        });
        aVar.a(f.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.3
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.k = false;
                aVarA.m = SystemClock.uptimeMillis();
                aVarA.s = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.c(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.k = true;
                aVarA.m = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.b(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                aVarA.k = false;
                aVarA.m = SystemClock.uptimeMillis();
                aVarA.D = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.a.b.class, a(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.a.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.f12999A = false;
                aVarA.x = SystemClock.uptimeMillis();
                aVarA.C = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.f12999A = true;
                aVarA.x = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.a.d.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.2
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.f13000B = false;
                aVarA.y = SystemClock.uptimeMillis();
                aVarA.D = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.b(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.f13000B = false;
                aVarA.y = SystemClock.uptimeMillis();
                aVarA.D = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.c(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                aVarA.f13000B = true;
                aVarA.y = SystemClock.uptimeMillis();
            }
        });
    }
}
