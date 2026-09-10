package com.google.common.base;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: MoreObjects.java */
/* JADX INFO: loaded from: classes3.dex */
public final class competently {

    /* JADX INFO: compiled from: MoreObjects.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f21526attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public C0307saneness f21527dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public boolean f21528marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final C0307saneness f21529saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public boolean f21530wireman;

        /* JADX INFO: compiled from: MoreObjects.java */
        public static final class attabal extends C0307saneness {
            public attabal() {
            }
        }

        /* JADX INFO: renamed from: com.google.common.base.competently$saneness$saneness, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MoreObjects.java */
        public static class C0307saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            @CheckForNull
            public C0307saneness f21531attabal;

            @CheckForNull
            String name;

            @CheckForNull
            Object value;
        }

        public static boolean taiyuan(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof Optional) {
                return !((Optional) obj).isPresent();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public saneness attabal(String str, int i) {
            return competently(str, String.valueOf(i));
        }

        public final attabal beachfront() {
            attabal attabalVar = new attabal();
            this.f21527dern.f21531attabal = attabalVar;
            this.f21527dern = attabalVar;
            return attabalVar;
        }

        public final saneness competently(String str, Object obj) {
            attabal attabalVarBeachfront = beachfront();
            attabalVarBeachfront.value = obj;
            attabalVarBeachfront.name = (String) formularize.triweekly(str);
            return this;
        }

        public final C0307saneness dern() {
            C0307saneness c0307saneness = new C0307saneness();
            this.f21527dern.f21531attabal = c0307saneness;
            this.f21527dern = c0307saneness;
            return c0307saneness;
        }

        public saneness impromptu(@CheckForNull Object obj) {
            return wireman(obj);
        }

        public final saneness marial(String str, @CheckForNull Object obj) {
            C0307saneness c0307sanenessDern = dern();
            c0307sanenessDern.value = obj;
            c0307sanenessDern.name = (String) formularize.triweekly(str);
            return this;
        }

        public saneness saneness(String str, @CheckForNull Object obj) {
            return marial(str, obj);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005d  */
        public String toString() {
            String str;
            boolean z = this.f21530wireman;
            boolean z2 = this.f21528marial;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f21526attabal);
            sb.append('{');
            String str2 = "";
            for (C0307saneness c0307saneness = this.f21529saneness.f21531attabal; c0307saneness != null; c0307saneness = c0307saneness.f21531attabal) {
                Object obj = c0307saneness.value;
                if (c0307saneness instanceof attabal) {
                    sb.append(str2);
                    str = c0307saneness.name;
                    if (str != null) {
                        sb.append(str);
                        sb.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z) {
                        sb.append(str2);
                        str = c0307saneness.name;
                        if (str != null) {
                            sb.append(str);
                            sb.append('=');
                        }
                        if (obj == null) {
                            sb.append(obj);
                        } else {
                            sb.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z2 || !taiyuan(obj)) {
                    sb.append(str2);
                    str = c0307saneness.name;
                    if (str != null) {
                        sb.append(str);
                        sb.append('=');
                    }
                    if (obj == null) {
                        sb.append(obj);
                    } else {
                        sb.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public final saneness wireman(@CheckForNull Object obj) {
            dern().value = obj;
            return this;
        }

        public saneness(String str) {
            C0307saneness c0307saneness = new C0307saneness();
            this.f21529saneness = c0307saneness;
            this.f21527dern = c0307saneness;
            this.f21530wireman = false;
            this.f21528marial = false;
            this.f21526attabal = (String) formularize.triweekly(str);
        }
    }

    public static <T> T attabal(@CheckForNull T t, @CheckForNull T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static saneness saneness(Object obj) {
        return new saneness(obj.getClass().getSimpleName());
    }
}
