// Compiled by ClojureScript 1.7.122 {}
goog.provide('cljs.repl');
goog.require('cljs.core');
cljs.repl.print_doc = (function cljs$repl$print_doc(m){
cljs.core.println.call(null,"-------------------------");

cljs.core.println.call(null,[cljs.core.str((function (){var temp__4425__auto__ = new cljs.core.Keyword(null,"ns","ns",441598760).cljs$core$IFn$_invoke$arity$1(m);
if(cljs.core.truth_(temp__4425__auto__)){
var ns = temp__4425__auto__;
return [cljs.core.str(ns),cljs.core.str("/")].join('');
} else {
return null;
}
})()),cljs.core.str(new cljs.core.Keyword(null,"name","name",1843675177).cljs$core$IFn$_invoke$arity$1(m))].join(''));

if(cljs.core.truth_(new cljs.core.Keyword(null,"protocol","protocol",652470118).cljs$core$IFn$_invoke$arity$1(m))){
cljs.core.println.call(null,"Protocol");
} else {
}

if(cljs.core.truth_(new cljs.core.Keyword(null,"forms","forms",2045992350).cljs$core$IFn$_invoke$arity$1(m))){
var seq__8112_8126 = cljs.core.seq.call(null,new cljs.core.Keyword(null,"forms","forms",2045992350).cljs$core$IFn$_invoke$arity$1(m));
var chunk__8113_8127 = null;
var count__8114_8128 = (0);
var i__8115_8129 = (0);
while(true){
if((i__8115_8129 < count__8114_8128)){
var f_8130 = cljs.core._nth.call(null,chunk__8113_8127,i__8115_8129);
cljs.core.println.call(null,"  ",f_8130);

var G__8131 = seq__8112_8126;
var G__8132 = chunk__8113_8127;
var G__8133 = count__8114_8128;
var G__8134 = (i__8115_8129 + (1));
seq__8112_8126 = G__8131;
chunk__8113_8127 = G__8132;
count__8114_8128 = G__8133;
i__8115_8129 = G__8134;
continue;
} else {
var temp__4425__auto___8135 = cljs.core.seq.call(null,seq__8112_8126);
if(temp__4425__auto___8135){
var seq__8112_8136__$1 = temp__4425__auto___8135;
if(cljs.core.chunked_seq_QMARK_.call(null,seq__8112_8136__$1)){
var c__5922__auto___8137 = cljs.core.chunk_first.call(null,seq__8112_8136__$1);
var G__8138 = cljs.core.chunk_rest.call(null,seq__8112_8136__$1);
var G__8139 = c__5922__auto___8137;
var G__8140 = cljs.core.count.call(null,c__5922__auto___8137);
var G__8141 = (0);
seq__8112_8126 = G__8138;
chunk__8113_8127 = G__8139;
count__8114_8128 = G__8140;
i__8115_8129 = G__8141;
continue;
} else {
var f_8142 = cljs.core.first.call(null,seq__8112_8136__$1);
cljs.core.println.call(null,"  ",f_8142);

var G__8143 = cljs.core.next.call(null,seq__8112_8136__$1);
var G__8144 = null;
var G__8145 = (0);
var G__8146 = (0);
seq__8112_8126 = G__8143;
chunk__8113_8127 = G__8144;
count__8114_8128 = G__8145;
i__8115_8129 = G__8146;
continue;
}
} else {
}
}
break;
}
} else {
if(cljs.core.truth_(new cljs.core.Keyword(null,"arglists","arglists",1661989754).cljs$core$IFn$_invoke$arity$1(m))){
var arglists_8147 = new cljs.core.Keyword(null,"arglists","arglists",1661989754).cljs$core$IFn$_invoke$arity$1(m);
if(cljs.core.truth_((function (){var or__5119__auto__ = new cljs.core.Keyword(null,"macro","macro",-867863404).cljs$core$IFn$_invoke$arity$1(m);
if(cljs.core.truth_(or__5119__auto__)){
return or__5119__auto__;
} else {
return new cljs.core.Keyword(null,"repl-special-function","repl-special-function",1262603725).cljs$core$IFn$_invoke$arity$1(m);
}
})())){
cljs.core.prn.call(null,arglists_8147);
} else {
cljs.core.prn.call(null,((cljs.core._EQ_.call(null,new cljs.core.Symbol(null,"quote","quote",1377916282,null),cljs.core.first.call(null,arglists_8147)))?cljs.core.second.call(null,arglists_8147):arglists_8147));
}
} else {
}
}

if(cljs.core.truth_(new cljs.core.Keyword(null,"special-form","special-form",-1326536374).cljs$core$IFn$_invoke$arity$1(m))){
cljs.core.println.call(null,"Special Form");

cljs.core.println.call(null," ",new cljs.core.Keyword(null,"doc","doc",1913296891).cljs$core$IFn$_invoke$arity$1(m));

if(cljs.core.contains_QMARK_.call(null,m,new cljs.core.Keyword(null,"url","url",276297046))){
if(cljs.core.truth_(new cljs.core.Keyword(null,"url","url",276297046).cljs$core$IFn$_invoke$arity$1(m))){
return cljs.core.println.call(null,[cljs.core.str("\n  Please see http://clojure.org/"),cljs.core.str(new cljs.core.Keyword(null,"url","url",276297046).cljs$core$IFn$_invoke$arity$1(m))].join(''));
} else {
return null;
}
} else {
return cljs.core.println.call(null,[cljs.core.str("\n  Please see http://clojure.org/special_forms#"),cljs.core.str(new cljs.core.Keyword(null,"name","name",1843675177).cljs$core$IFn$_invoke$arity$1(m))].join(''));
}
} else {
if(cljs.core.truth_(new cljs.core.Keyword(null,"macro","macro",-867863404).cljs$core$IFn$_invoke$arity$1(m))){
cljs.core.println.call(null,"Macro");
} else {
}

if(cljs.core.truth_(new cljs.core.Keyword(null,"repl-special-function","repl-special-function",1262603725).cljs$core$IFn$_invoke$arity$1(m))){
cljs.core.println.call(null,"REPL Special Function");
} else {
}

cljs.core.println.call(null," ",new cljs.core.Keyword(null,"doc","doc",1913296891).cljs$core$IFn$_invoke$arity$1(m));

if(cljs.core.truth_(new cljs.core.Keyword(null,"protocol","protocol",652470118).cljs$core$IFn$_invoke$arity$1(m))){
var seq__8116 = cljs.core.seq.call(null,new cljs.core.Keyword(null,"methods","methods",453930866).cljs$core$IFn$_invoke$arity$1(m));
var chunk__8117 = null;
var count__8118 = (0);
var i__8119 = (0);
while(true){
if((i__8119 < count__8118)){
var vec__8120 = cljs.core._nth.call(null,chunk__8117,i__8119);
var name = cljs.core.nth.call(null,vec__8120,(0),null);
var map__8121 = cljs.core.nth.call(null,vec__8120,(1),null);
var map__8121__$1 = ((((!((map__8121 == null)))?((((map__8121.cljs$lang$protocol_mask$partition0$ & (64))) || (map__8121.cljs$core$ISeq$))?true:false):false))?cljs.core.apply.call(null,cljs.core.hash_map,map__8121):map__8121);
var doc = cljs.core.get.call(null,map__8121__$1,new cljs.core.Keyword(null,"doc","doc",1913296891));
var arglists = cljs.core.get.call(null,map__8121__$1,new cljs.core.Keyword(null,"arglists","arglists",1661989754));
cljs.core.println.call(null);

cljs.core.println.call(null," ",name);

cljs.core.println.call(null," ",arglists);

if(cljs.core.truth_(doc)){
cljs.core.println.call(null," ",doc);
} else {
}

var G__8148 = seq__8116;
var G__8149 = chunk__8117;
var G__8150 = count__8118;
var G__8151 = (i__8119 + (1));
seq__8116 = G__8148;
chunk__8117 = G__8149;
count__8118 = G__8150;
i__8119 = G__8151;
continue;
} else {
var temp__4425__auto__ = cljs.core.seq.call(null,seq__8116);
if(temp__4425__auto__){
var seq__8116__$1 = temp__4425__auto__;
if(cljs.core.chunked_seq_QMARK_.call(null,seq__8116__$1)){
var c__5922__auto__ = cljs.core.chunk_first.call(null,seq__8116__$1);
var G__8152 = cljs.core.chunk_rest.call(null,seq__8116__$1);
var G__8153 = c__5922__auto__;
var G__8154 = cljs.core.count.call(null,c__5922__auto__);
var G__8155 = (0);
seq__8116 = G__8152;
chunk__8117 = G__8153;
count__8118 = G__8154;
i__8119 = G__8155;
continue;
} else {
var vec__8123 = cljs.core.first.call(null,seq__8116__$1);
var name = cljs.core.nth.call(null,vec__8123,(0),null);
var map__8124 = cljs.core.nth.call(null,vec__8123,(1),null);
var map__8124__$1 = ((((!((map__8124 == null)))?((((map__8124.cljs$lang$protocol_mask$partition0$ & (64))) || (map__8124.cljs$core$ISeq$))?true:false):false))?cljs.core.apply.call(null,cljs.core.hash_map,map__8124):map__8124);
var doc = cljs.core.get.call(null,map__8124__$1,new cljs.core.Keyword(null,"doc","doc",1913296891));
var arglists = cljs.core.get.call(null,map__8124__$1,new cljs.core.Keyword(null,"arglists","arglists",1661989754));
cljs.core.println.call(null);

cljs.core.println.call(null," ",name);

cljs.core.println.call(null," ",arglists);

if(cljs.core.truth_(doc)){
cljs.core.println.call(null," ",doc);
} else {
}

var G__8156 = cljs.core.next.call(null,seq__8116__$1);
var G__8157 = null;
var G__8158 = (0);
var G__8159 = (0);
seq__8116 = G__8156;
chunk__8117 = G__8157;
count__8118 = G__8158;
i__8119 = G__8159;
continue;
}
} else {
return null;
}
}
break;
}
} else {
return null;
}
}
});

//# sourceMappingURL=repl.js.map