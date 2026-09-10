package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: compiled from: CollectCollectors.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nosophobia {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Collector<Object, ?, ImmutableList<Object>> f21917attabal = Collector.of(new Supplier() { // from class: com.google.common.collect.taiyuan
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableList.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.creditor
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableList.attabal) obj).attabal(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.cultivated
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableList.attabal) obj).triweekly((ImmutableList.attabal) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.milliradian
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableList.attabal) obj).impassible();
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Collector<Object, ?, ImmutableSet<Object>> f21919saneness = Collector.of(new Supplier() { // from class: com.google.common.collect.treadless
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.itchy
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableSet.attabal) obj).attabal(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.coffeecake
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableSet.attabal) obj).kowloon((ImmutableSet.attabal) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.lerp
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableSet.attabal) obj).triweekly();
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Collector<Range<Comparable<?>>, ?, ImmutableRangeSet<Comparable<?>>> f21918dern = Collector.of(new Supplier() { // from class: com.google.common.collect.cutely
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableRangeSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.apical
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableRangeSet.attabal) obj).attabal((Range) obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.graveside
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableRangeSet.attabal) obj).wireman((ImmutableRangeSet.attabal) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.yemenite
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableRangeSet.attabal) obj).dern();
        }
    }, new Collector.Characteristics[0]);

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> adultoid(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        com.google.common.base.formularize.kowloon(function, "keyFunction");
        com.google.common.base.formularize.kowloon(function2, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.supplicat
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableListMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.restrictive
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableListMultimap.attabal) obj).wireman(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.merc
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableListMultimap.attabal) obj).taiyuan((ImmutableListMultimap.attabal) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.polder
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableListMultimap.attabal) obj).impromptu();
            }
        }, new Collector.Characteristics[0]);
    }

    public static /* synthetic */ TreeMap apical(Comparator comparator) {
        return new TreeMap(comparator);
    }

    public static /* synthetic */ claque arytenoidectomy(claque claqueVar, claque claqueVar2) {
        claqueVar.putAll(claqueVar2);
        return claqueVar;
    }

    public static /* synthetic */ ImmutableSortedSet.attabal beachfront(Comparator comparator) {
        return new ImmutableSortedSet.attabal(comparator);
    }

    public static <E> Collector<E, ?, ImmutableSet<E>> cord() {
        return (Collector<E, ?, ImmutableSet<E>>) f21919saneness;
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> cuirassed(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        com.google.common.base.formularize.kowloon(function, "keyFunction");
        com.google.common.base.formularize.kowloon(function2, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.seminary
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableSetMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.grimness
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSetMultimap.attabal) obj).wireman(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.saran
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSetMultimap.attabal) obj).taiyuan((ImmutableSetMultimap.attabal) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.privatdozent
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSetMultimap.attabal) obj).impromptu();
            }
        }, new Collector.Characteristics[0]);
    }

    public static /* synthetic */ hardpan cutely(hardpan hardpanVar, hardpan hardpanVar2) {
        hardpanVar.addAll(hardpanVar2);
        return hardpanVar;
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> dovishness(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        com.google.common.base.formularize.triweekly(function);
        com.google.common.base.formularize.triweekly(function2);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.preprohormone
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableMap.saneness();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.cord
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableMap.saneness) obj).competently(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.cuirassed
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableMap.saneness) obj).wireman((ImmutableMap.saneness) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.stratoscope
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableMap.saneness) obj).dern();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> gintrap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        com.google.common.base.formularize.triweekly(function);
        com.google.common.base.formularize.triweekly(function2);
        com.google.common.base.formularize.triweekly(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.starveling
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }), new Function() { // from class: com.google.common.collect.hydrovane
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMap.copyOf((Map) obj);
            }
        });
    }

    public static <E> Collector<E, ?, ImmutableList<E>> graveside() {
        return (Collector<E, ?, ImmutableList<E>>) f21917attabal;
    }

    public static /* synthetic */ void impassible(Function function, Function function2, claque claqueVar, Object obj) {
        final Collection collection2 = claqueVar.get(function.apply(obj));
        Stream stream = (Stream) function2.apply(obj);
        Objects.requireNonNull(collection2);
        stream.forEachOrdered(new Consumer() { // from class: com.google.common.collect.timberyard
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                collection2.add(obj2);
            }
        });
    }

    public static <T, K, V, M extends claque<K, V>> Collector<T, ?, M> molybdenite(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2, Supplier<M> supplier) {
        com.google.common.base.formularize.triweekly(function);
        com.google.common.base.formularize.triweekly(function2);
        com.google.common.base.formularize.triweekly(supplier);
        return Collector.of(supplier, new BiConsumer() { // from class: com.google.common.collect.overspeculate
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                nosophobia.impassible(function, function2, (claque) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.clubfoot
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return nosophobia.arytenoidectomy((claque) obj, (claque) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> monoploid(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2) {
        com.google.common.base.formularize.triweekly(function);
        com.google.common.base.formularize.triweekly(function2);
        Function function3 = new Function() { // from class: com.google.common.collect.formularize
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return com.google.common.base.formularize.triweekly(function.apply(obj));
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.impassible
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Stream) function2.apply(obj)).peek(new premeiotic());
            }
        };
        final MultimapBuilder.wireman<Object, Object> wiremanVarAttabal = MultimapBuilder.dern().attabal();
        Objects.requireNonNull(wiremanVarAttabal);
        return Collectors.collectingAndThen(molybdenite(function3, function4, new Supplier() { // from class: com.google.common.collect.triweekly
            @Override // java.util.function.Supplier
            public final Object get() {
                return wiremanVarAttabal.competently();
            }
        }), new Function() { // from class: com.google.common.collect.kowloon
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableListMultimap.copyOf((claque) obj);
            }
        });
    }

    public static <E> Collector<E, ?, ImmutableSortedSet<E>> oilcan(final Comparator<? super E> comparator) {
        com.google.common.base.formularize.triweekly(comparator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.trm
            @Override // java.util.function.Supplier
            public final Object get() {
                return nosophobia.beachfront(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.oilcan
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedSet.attabal) obj).attabal(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.sealless
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedSet.attabal) obj).kowloon((ImmutableSortedSet.attabal) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.kattegat
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedSet.attabal) obj).triweekly();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> polloi(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2) {
        com.google.common.base.formularize.triweekly(function);
        com.google.common.base.formularize.triweekly(function2);
        Function function3 = new Function() { // from class: com.google.common.collect.adultoid
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return com.google.common.base.formularize.triweekly(function.apply(obj));
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.dovishness
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Stream) function2.apply(obj)).peek(new premeiotic());
            }
        };
        final MultimapBuilder.beachfront<Object, Object> beachfrontVarWireman = MultimapBuilder.dern().wireman();
        Objects.requireNonNull(beachfrontVarWireman);
        return Collectors.collectingAndThen(molybdenite(function3, function4, new Supplier() { // from class: com.google.common.collect.gintrap
            @Override // java.util.function.Supplier
            public final Object get() {
                return beachfrontVarWireman.competently();
            }
        }), new Function() { // from class: com.google.common.collect.rotuma
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSetMultimap.copyOf((claque) obj);
            }
        });
    }

    public static <E extends Comparable<? super E>> Collector<Range<E>, ?, ImmutableRangeSet<E>> preprohormone() {
        return (Collector<Range<E>, ?, ImmutableRangeSet<E>>) f21918dern;
    }

    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> rotuma(final Function<? super T, ? extends E> function, final ToIntFunction<? super T> toIntFunction) {
        com.google.common.base.formularize.triweekly(function);
        com.google.common.base.formularize.triweekly(toIntFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.arytenoidectomy
            @Override // java.util.function.Supplier
            public final Object get() {
                return LinkedHashMultiset.create();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.monoploid
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((hardpan) obj).add(com.google.common.base.formularize.triweekly(function.apply(obj2)), toIntFunction.applyAsInt(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.polloi
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return nosophobia.cutely((hardpan) obj, (hardpan) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.molybdenite
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMultiset.copyFromEntries(((hardpan) obj).entrySet());
            }
        }, new Collector.Characteristics[0]);
    }

    public static /* synthetic */ ImmutableSortedMap.attabal saneness(Comparator comparator) {
        return new ImmutableSortedMap.attabal(comparator);
    }

    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> stratoscope(final Comparator<? super K> comparator, final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        com.google.common.base.formularize.triweekly(comparator);
        com.google.common.base.formularize.triweekly(function);
        com.google.common.base.formularize.triweekly(function2);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.walach
            @Override // java.util.function.Supplier
            public final Object get() {
                return nosophobia.saneness(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.peridotite
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedMap.attabal) obj).competently(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.mathsort
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedMap.attabal) obj).triweekly((ImmutableSortedMap.attabal) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.splinterproof
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedMap.attabal) obj).dern();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> trm(final Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        com.google.common.base.formularize.triweekly(comparator);
        com.google.common.base.formularize.triweekly(function);
        com.google.common.base.formularize.triweekly(function2);
        com.google.common.base.formularize.triweekly(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.dent
            @Override // java.util.function.Supplier
            public final Object get() {
                return nosophobia.apical(comparator);
            }
        }), new Function() { // from class: com.google.common.collect.permissivist
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSortedMap.copyOfSorted((TreeMap) obj);
            }
        });
    }
}
