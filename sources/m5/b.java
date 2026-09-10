package m5;

import com.google.android.gms.internal.measurement.f2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g4.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f45871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g4.f fVar, int i10) {
        super(fVar);
        this.f45871d = i10;
    }

    @Override // g4.j
    public final String b() {
        switch (this.f45871d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01df -> B:162:0x01e2). Please report as a decompilation issue!!! */
    public final void d(l4.f fVar, Object obj) throws Throwable {
        int i10;
        int i11;
        ?? byteArrayOutputStream;
        Throwable th2;
        ?? r3;
        ?? r2;
        switch (this.f45871d) {
            case 0:
                a aVar = (a) obj;
                String str = aVar.f45869a;
                if (str == null) {
                    fVar.k(1);
                } else {
                    fVar.n(1, str);
                }
                String str2 = aVar.f45870b;
                if (str2 == null) {
                    fVar.k(2);
                    return;
                } else {
                    fVar.n(2, str2);
                    return;
                }
            case 1:
                c cVar = (c) obj;
                String str3 = cVar.f45872a;
                if (str3 == null) {
                    fVar.k(1);
                } else {
                    fVar.n(1, str3);
                }
                Long l = cVar.f45873b;
                if (l == null) {
                    fVar.k(2);
                    return;
                } else {
                    fVar.j(2, l.longValue());
                    return;
                }
            case 2:
                d dVar = (d) obj;
                String str4 = dVar.f45874a;
                if (str4 == null) {
                    fVar.k(1);
                } else {
                    fVar.n(1, str4);
                }
                fVar.j(2, dVar.f45875b);
                return;
            case 3:
                f fVar2 = (f) obj;
                fVar2.getClass();
                fVar.k(1);
                String str5 = fVar2.f45877a;
                if (str5 == null) {
                    fVar.k(2);
                    return;
                } else {
                    fVar.n(2, str5);
                    return;
                }
            case 4:
                g gVar = (g) obj;
                String str6 = gVar.f45878a;
                if (str6 == null) {
                    fVar.k(1);
                } else {
                    fVar.n(1, str6);
                }
                byte[] bArrC = d5.f.c(gVar.f45879b);
                if (bArrC == null) {
                    fVar.k(2);
                    return;
                } else {
                    fVar.h(2, bArrC);
                    return;
                }
            case 5:
                i iVar = (i) obj;
                String str7 = iVar.f45882a;
                int i12 = 1;
                if (str7 == null) {
                    fVar.k(1);
                } else {
                    fVar.n(1, str7);
                }
                fVar.j(2, j1.f.I(iVar.f45883b));
                String str8 = iVar.f45884c;
                if (str8 == null) {
                    fVar.k(3);
                } else {
                    fVar.n(3, str8);
                }
                String str9 = iVar.f45885d;
                if (str9 == null) {
                    fVar.k(4);
                } else {
                    fVar.n(4, str9);
                }
                byte[] bArrC2 = d5.f.c(iVar.f45886e);
                if (bArrC2 == null) {
                    fVar.k(5);
                } else {
                    fVar.h(5, bArrC2);
                }
                byte[] bArrC3 = d5.f.c(iVar.f45887f);
                if (bArrC3 == null) {
                    fVar.k(6);
                } else {
                    fVar.h(6, bArrC3);
                }
                fVar.j(7, iVar.f45888g);
                fVar.j(8, iVar.f45889h);
                fVar.j(9, iVar.f45890i);
                fVar.j(10, iVar.f45892k);
                int i13 = iVar.l;
                int iC = v0.i.c(i13);
                if (iC == 0) {
                    i10 = 0;
                } else {
                    if (iC != 1) {
                        StringBuilder sb2 = new StringBuilder("Could not convert ");
                        sb2.append(i13 != 1 ? i13 != 2 ? "null" : "LINEAR" : "EXPONENTIAL");
                        sb2.append(" to int");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    i10 = 1;
                }
                fVar.j(11, i10);
                fVar.j(12, iVar.f45893m);
                fVar.j(13, iVar.f45894n);
                fVar.j(14, iVar.f45895o);
                fVar.j(15, iVar.f45896p);
                fVar.j(16, iVar.f45897q ? 1L : 0L);
                int i14 = iVar.f45898r;
                int iC2 = v0.i.c(i14);
                if (iC2 == 0) {
                    i11 = 0;
                } else {
                    if (iC2 != 1) {
                        StringBuilder sb3 = new StringBuilder("Could not convert ");
                        sb3.append(i14 != 1 ? i14 != 2 ? "null" : "DROP_WORK_REQUEST" : "RUN_AS_NON_EXPEDITED_WORK_REQUEST");
                        sb3.append(" to int");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    i11 = 1;
                }
                fVar.j(17, i11);
                d5.b bVar = iVar.f45891j;
                if (bVar == null) {
                    fVar.k(18);
                    fVar.k(19);
                    fVar.k(20);
                    fVar.k(21);
                    fVar.k(22);
                    fVar.k(23);
                    fVar.k(24);
                    fVar.k(25);
                    return;
                }
                int i15 = bVar.f38676a;
                int iC3 = v0.i.c(i15);
                if (iC3 == 0) {
                    i12 = 0;
                } else if (iC3 != 1) {
                    if (iC3 == 2) {
                        i12 = 2;
                    } else if (iC3 == 3) {
                        i12 = 3;
                    } else if (iC3 == 4) {
                        i12 = 4;
                    } else {
                        if (i15 != 6) {
                            throw new IllegalArgumentException("Could not convert " + f2.C(i15) + " to int");
                        }
                        i12 = 5;
                    }
                }
                fVar.j(18, i12);
                fVar.j(19, bVar.f38677b ? 1L : 0L);
                fVar.j(20, bVar.f38678c ? 1L : 0L);
                fVar.j(21, bVar.f38679d ? 1L : 0L);
                fVar.j(22, bVar.f38680e ? 1L : 0L);
                fVar.j(23, bVar.f38681f);
                fVar.j(24, bVar.f38682g);
                d5.d dVar2 = bVar.f38683h;
                HashSet hashSet = dVar2.f38686a;
                HashSet<d5.c> hashSet2 = dVar2.f38686a;
                byte[] byteArray = null;
                ObjectOutputStream objectOutputStream = null;
                byteArray = null;
                if (hashSet.size() != 0) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            try {
                                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    objectOutputStream2.writeInt(hashSet2.size());
                                    for (d5.c cVar2 : hashSet2) {
                                        objectOutputStream2.writeUTF(cVar2.f38684a.toString());
                                        objectOutputStream2.writeBoolean(cVar2.f38685b);
                                    }
                                    objectOutputStream2.close();
                                } catch (IOException e10) {
                                    e = e10;
                                    objectOutputStream = objectOutputStream2;
                                    e.printStackTrace();
                                    if (objectOutputStream != null) {
                                        objectOutputStream.close();
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    r3 = objectOutputStream2;
                                    r2 = byteArrayOutputStream;
                                    if (r3 != 0) {
                                        try {
                                            r3.close();
                                        } catch (IOException e11) {
                                            e11.printStackTrace();
                                        }
                                    }
                                    try {
                                        r2.close();
                                        throw th2;
                                    } catch (IOException e12) {
                                        e12.printStackTrace();
                                        throw th2;
                                    }
                                }
                            } catch (IOException e13) {
                                e = e13;
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                        } catch (Throwable th4) {
                            th2 = th4;
                            r2 = byteArrayOutputStream;
                            r3 = byteArray;
                        }
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                    break;
                }
                if (byteArray == null) {
                    byteArrayOutputStream = 25;
                    fVar.k(25);
                } else {
                    byteArrayOutputStream = 25;
                    fVar.h(25, byteArray);
                }
                return;
            default:
                j jVar = (j) obj;
                String str10 = jVar.f45899a;
                if (str10 == null) {
                    fVar.k(1);
                } else {
                    fVar.n(1, str10);
                }
                String str11 = jVar.f45900b;
                if (str11 == null) {
                    fVar.k(2);
                    return;
                } else {
                    fVar.n(2, str11);
                    return;
                }
        }
    }

    public final void e(Object obj) {
        l4.f fVarA = a();
        try {
            d(fVarA, obj);
            fVarA.f45036d.executeInsert();
        } finally {
            c(fVarA);
        }
    }
}
