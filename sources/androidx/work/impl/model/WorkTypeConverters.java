package androidx.work.impl.model;

import android.net.Uri;
import android.os.Build;
import androidx.datastore.preferences.protobuf.a;
import androidx.work.BackoffPolicy;
import androidx.work.ContentUriTriggers;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes.dex */
public class WorkTypeConverters {

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkTypeConverters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f8798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f8799c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[OutOfQuotaPolicy.values().length];
            d = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[NetworkType.values().length];
            f8799c = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8799c[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8799c[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8799c[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8799c[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[BackoffPolicy.values().length];
            f8798b = iArr3;
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8798b[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[WorkInfo.State.values().length];
            f8797a = iArr4;
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8797a[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8797a[2] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8797a[3] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8797a[4] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8797a[5] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public interface BackoffPolicyIds {
    }

    public interface NetworkTypeIds {
    }

    public interface OutOfPolicyIds {
    }

    public interface StateIds {
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static ContentUriTriggers a(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e2;
        ContentUriTriggers contentUriTriggers = new ContentUriTriggers();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    try {
                        objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            for (int i2 = objectInputStream.readInt(); i2 > 0; i2--) {
                                contentUriTriggers.f8613a.add(new ContentUriTriggers.Trigger(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                            }
                            try {
                                objectInputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                            byteArrayInputStream.close();
                        } catch (IOException e4) {
                            e2 = e4;
                            e2.printStackTrace();
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            byteArrayInputStream.close();
                        }
                    } catch (IOException e6) {
                        objectInputStream = null;
                        e2 = e6;
                    } catch (Throwable th2) {
                        th = th2;
                        if (0 != 0) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th;
                        } catch (IOException e8) {
                            e8.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                        objectInputStream2.close();
                    }
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (IOException e9) {
                e9.printStackTrace();
            }
        }
        return contentUriTriggers;
    }

    public static BackoffPolicy b(int i2) {
        if (i2 == 0) {
            return BackoffPolicy.X;
        }
        if (i2 == 1) {
            return BackoffPolicy.f8598Y;
        }
        throw new IllegalArgumentException(a.k("Could not convert ", i2, " to BackoffPolicy"));
    }

    public static NetworkType c(int i2) {
        if (i2 == 0) {
            return NetworkType.X;
        }
        if (i2 == 1) {
            return NetworkType.f8632Y;
        }
        if (i2 == 2) {
            return NetworkType.Z;
        }
        if (i2 == 3) {
            return NetworkType.e0;
        }
        if (i2 == 4) {
            return NetworkType.f0;
        }
        if (Build.VERSION.SDK_INT < 30 || i2 != 5) {
            throw new IllegalArgumentException(a.k("Could not convert ", i2, " to NetworkType"));
        }
        return NetworkType.g0;
    }

    public static OutOfQuotaPolicy d(int i2) {
        if (i2 == 0) {
            return OutOfQuotaPolicy.X;
        }
        if (i2 == 1) {
            return OutOfQuotaPolicy.f8637Y;
        }
        throw new IllegalArgumentException(a.k("Could not convert ", i2, " to OutOfQuotaPolicy"));
    }

    public static WorkInfo.State e(int i2) {
        if (i2 == 0) {
            return WorkInfo.State.X;
        }
        if (i2 == 1) {
            return WorkInfo.State.f8642Y;
        }
        if (i2 == 2) {
            return WorkInfo.State.Z;
        }
        if (i2 == 3) {
            return WorkInfo.State.e0;
        }
        if (i2 == 4) {
            return WorkInfo.State.f0;
        }
        if (i2 == 5) {
            return WorkInfo.State.g0;
        }
        throw new IllegalArgumentException(a.k("Could not convert ", i2, " to State"));
    }

    public static int f(WorkInfo.State state) {
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                i2 = 3;
                if (iOrdinal != 3) {
                    i2 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + state + " to int");
                    }
                }
            }
        }
        return i2;
    }
}
