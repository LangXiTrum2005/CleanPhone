package androidx.customview.widget;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class FocusStrategy {

    public interface BoundsAdapter<T> {
    }

    public interface CollectionAdapter<T, V> {
    }

    public static class SequentialComparator<T> implements Comparator<T> {
        public final Rect X = new Rect();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Rect f4587Y = new Rect();
        public final boolean Z;
        public final BoundsAdapter e0;

        public SequentialComparator(boolean z2, BoundsAdapter boundsAdapter) {
            this.Z = z2;
            this.e0 = boundsAdapter;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            ExploreByTouchHelper.AnonymousClass1 anonymousClass1 = (ExploreByTouchHelper.AnonymousClass1) this.e0;
            Rect rect = this.X;
            anonymousClass1.a(obj, rect);
            Rect rect2 = this.f4587Y;
            anonymousClass1.a(obj2, rect2);
            int i2 = rect.top;
            int i3 = rect2.top;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
            int i4 = rect.left;
            int i5 = rect2.left;
            boolean z2 = this.Z;
            if (i4 < i5) {
                return z2 ? 1 : -1;
            }
            if (i4 > i5) {
                return z2 ? -1 : 1;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.right;
            int i9 = rect2.right;
            if (i8 < i9) {
                return z2 ? 1 : -1;
            }
            if (i8 > i9) {
                return z2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static boolean a(int i2, Rect rect, Rect rect2, Rect rect3) {
        int iD;
        int i3;
        int i4;
        boolean zB = b(rect, rect2, i2);
        if (b(rect, rect3, i2) || !zB) {
            return false;
        }
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i2 != 17 && i2 != 66) {
                            iD = d(rect, rect2, i2);
                            if (i2 != 17) {
                                i3 = rect.left;
                                i4 = rect3.left;
                            } else if (i2 != 33) {
                                i3 = rect.top;
                                i4 = rect3.top;
                            } else if (i2 != 66) {
                                i3 = rect3.right;
                                i4 = rect.right;
                            } else {
                                if (i2 == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i3 = rect3.bottom;
                                i4 = rect.bottom;
                            }
                            if (iD < Math.max(1, i3 - i4)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i2 != 17) {
                        iD = d(rect, rect2, i2);
                        if (i2 != 17) {
                            i3 = rect.left;
                            i4 = rect3.left;
                        } else if (i2 != 33) {
                            i3 = rect.top;
                            i4 = rect3.top;
                        } else if (i2 != 66) {
                            i3 = rect3.right;
                            i4 = rect.right;
                        } else {
                            if (i2 == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i3 = rect3.bottom;
                            i4 = rect.bottom;
                        }
                        if (iD < Math.max(1, i3 - i4)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i2 != 17) {
                    iD = d(rect, rect2, i2);
                    if (i2 != 17) {
                        i3 = rect.left;
                        i4 = rect3.left;
                    } else if (i2 != 33) {
                        i3 = rect.top;
                        i4 = rect3.top;
                    } else if (i2 != 66) {
                        i3 = rect3.right;
                        i4 = rect.right;
                    } else {
                        if (i2 == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i3 = rect3.bottom;
                        i4 = rect.bottom;
                    }
                    if (iD < Math.max(1, i3 - i4)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i2 != 17) {
                iD = d(rect, rect2, i2);
                if (i2 != 17) {
                    i3 = rect.left;
                    i4 = rect3.left;
                } else if (i2 != 33) {
                    i3 = rect.top;
                    i4 = rect3.top;
                } else if (i2 != 66) {
                    i3 = rect3.right;
                    i4 = rect.right;
                } else {
                    if (i2 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i3 = rect3.bottom;
                    i4 = rect.bottom;
                }
                if (iD < Math.max(1, i3 - i4)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(Rect rect, Rect rect2, int i2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(Rect rect, Rect rect2, int i2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    public static int d(Rect rect, Rect rect2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 == 66) {
                    i6 = rect2.left;
                    i7 = rect.right;
                } else {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i6 = rect2.top;
                    i7 = rect.bottom;
                }
                i5 = i6 - i7;
            } else {
                i3 = rect.top;
                i4 = rect2.bottom;
            }
            return Math.max(0, i5);
        }
        i3 = rect.left;
        i4 = rect2.right;
        i5 = i3 - i4;
        return Math.max(0, i5);
    }

    public static int e(Rect rect, Rect rect2, int i2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
