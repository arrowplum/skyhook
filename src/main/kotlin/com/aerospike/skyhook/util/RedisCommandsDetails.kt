package com.aerospike.skyhook.util

import com.aerospike.skyhook.command.RedisCommandDetails

object RedisCommandsDetails {

    val getCommand = RedisCommandDetails("get", 2, arrayListOf("readonly", "fast"), 1, 1, 1)
    val mgetCommand = RedisCommandDetails("mget", -2, arrayListOf("readonly", "fast"), 1, -1, 1)
    val getsetCommand = RedisCommandDetails("getset", 3, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val setCommand = RedisCommandDetails("set", -3, arrayListOf("write", "denyoom"), 1, 1, 1)
    val setexCommand = RedisCommandDetails("setex", 4, arrayListOf("write", "denyoom"), 1, 1, 1)
    val psetexCommand = RedisCommandDetails("psetex", 4, arrayListOf("write", "denyoom"), 1, 1, 1)
    val setnxCommand = RedisCommandDetails("setnx", 3, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val msetCommand = RedisCommandDetails("mset", -3, arrayListOf("write", "denyoom"), 1, -1, 2)
    val msetnxCommand = RedisCommandDetails("msetnx", -3, arrayListOf("write", "denyoom"), 1, -1, 2)
    val existsCommand = RedisCommandDetails("exists", -2, arrayListOf("readonly", "fast"), 1, -1, 1)
    val expireCommand = RedisCommandDetails("expire", 3, arrayListOf("write", "fast"), 1, 1, 1)
    val pexpireCommand = RedisCommandDetails("pexpire", 3, arrayListOf("write", "fast"), 1, 1, 1)
    val expireatCommand = RedisCommandDetails("expireat", 3, arrayListOf("write", "fast"), 1, 1, 1)
    val pexpireatCommand = RedisCommandDetails("pexpireat", 3, arrayListOf("write", "fast"), 1, 1, 1)
    val persistCommand = RedisCommandDetails("persist", 2, arrayListOf("write", "fast"), 1, 1, 1)
    val appendCommand = RedisCommandDetails("append", 3, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val incrCommand = RedisCommandDetails("incr", 2, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val incrbyCommand = RedisCommandDetails("incrby", 3, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val incrbyfloatCommand = RedisCommandDetails("incrbyfloat", 3, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val decrCommand = RedisCommandDetails("decr", 2, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val decrbyCommand = RedisCommandDetails("decrby", 3, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val strlenCommand = RedisCommandDetails("strlen", 2, arrayListOf("readonly", "fast"), 1, 1, 1)
    val ttlCommand = RedisCommandDetails("ttl", 2, arrayListOf("readonly", "random", "fast"), 1, 1, 1)
    val pttlCommand = RedisCommandDetails("pttl", 2, arrayListOf("readonly", "random", "fast"), 1, 1, 1)
    val delCommand = RedisCommandDetails("del", -2, arrayListOf("write"), 1, -1, 1)
    val unlinkCommand = RedisCommandDetails("unlink", -2, arrayListOf("write", "fast"), 1, -1, 1)
    val randomkeyCommand = RedisCommandDetails("randomkey", 1, arrayListOf("readonly", "random"), 0, 0, 0)
    val touchCommand = RedisCommandDetails("touch", -2, arrayListOf("readonly", "fast"), 1, -1, 1)
    val typeCommand = RedisCommandDetails("type", 2, arrayListOf("readonly", "fast"), 1, 1, 1)

    val lpushCommand = RedisCommandDetails("lpush", -3, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val lpushxCommand = RedisCommandDetails("lpushx", -3, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val rpushCommand = RedisCommandDetails("rpush", -3, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val rpushxCommand = RedisCommandDetails("rpushx", -3, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val lindexCommand = RedisCommandDetails("lindex", 3, arrayListOf("readonly"), 1, 1, 1)
    val llenCommand = RedisCommandDetails("llen", 2, arrayListOf("readonly", "fast"), 1, 1, 1)
    val lpopCommand = RedisCommandDetails("lpop", -2, arrayListOf("write", "fast"), 1, 1, 1)
    val rpopCommand = RedisCommandDetails("rpop", -2, arrayListOf("write", "fast"), 1, 1, 1)
    val lrangeCommand = RedisCommandDetails("lrange", 4, arrayListOf("readonly"), 1, 1, 1)

    val hsetCommand = RedisCommandDetails("hset", -4, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val hsetnxCommand = RedisCommandDetails("hsetnx", 4, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val hmsetCommand = RedisCommandDetails("hmset", -4, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val saddCommand = RedisCommandDetails("sadd", -3, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val hexistsCommand = RedisCommandDetails("hexists", 3, arrayListOf("readonly", "fast"), 1, 1, 1)
    val sismemberCommand = RedisCommandDetails("sismember", 3, arrayListOf("readonly", "fast"), 1, 1, 1)
    val hgetCommand = RedisCommandDetails("hget", 3, arrayListOf("readonly", "fast"), 1, 1, 1)
    val hmgetCommand = RedisCommandDetails("hmget", -3, arrayListOf("readonly", "fast"), 1, 1, 1)
    val hgetallCommand = RedisCommandDetails("hgetall", 2, arrayListOf("readonly", "random"), 1, 1, 1)
    val hvalsCommand = RedisCommandDetails("hvals", 2, arrayListOf("readonly", "sort_for_script"), 1, 1, 1)
    val hkeysCommand = RedisCommandDetails("hkeys", 2, arrayListOf("readonly", "sort_for_script"), 1, 1, 1)
    val smembersCommand = RedisCommandDetails("smembers", 2, arrayListOf("readonly", "sort_for_script"), 1, 1, 1)
    val hincrbyCommand = RedisCommandDetails("hincrby", 4, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val hincrbyfloatCommand = RedisCommandDetails("hincrbyfloat", 4, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val hstrlenCommand = RedisCommandDetails("hstrlen", 3, arrayListOf("readonly", "fast"), 1, 1, 1)
    val hlenCommand = RedisCommandDetails("hlen", 2, arrayListOf("readonly", "fast"), 1, 1, 1)
    val scardCommand = RedisCommandDetails("scard", 2, arrayListOf("readonly", "fast"), 1, 1, 1)
    val zcardCommand = RedisCommandDetails("zcard", 2, arrayListOf("readonly", "fast"), 1, 1, 1)
    val hdelCommand = RedisCommandDetails("hdel", -3, arrayListOf("write", "fast"), 1, 1, 1)
    val sremCommand = RedisCommandDetails("srem", -3, arrayListOf("write", "fast"), 1, 1, 1)
    val zremCommand = RedisCommandDetails("zrem", -3, arrayListOf("write", "fast"), 1, 1, 1)
    val sunionCommand = RedisCommandDetails("sunion", -2, arrayListOf("readonly", "sort_for_script"), 1, -1, 1)
    val sinterCommand = RedisCommandDetails("sinter", -2, arrayListOf("readonly", "sort_for_script"), 1, -1, 1)
    val sunionstoreCommand = RedisCommandDetails("sunionstore", -3, arrayListOf("write", "denyoom"), 1, -1, 1)
    val sinterstoreCommand = RedisCommandDetails("sinterstore", -3, arrayListOf("write", "denyoom"), 1, -1, 1)
    val zmscoreCommand = RedisCommandDetails("zmscore", -3, arrayListOf("readonly", "fast"), 1, 1, 1)
    val zrankCommand = RedisCommandDetails("zrank", 3, arrayListOf("readonly", "fast"), 1, 1, 1)
    val zincrbyCommand = RedisCommandDetails("zincrby", 4, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val zaddCommand = RedisCommandDetails("zadd", -4, arrayListOf("write", "denyoom", "fast"), 1, 1, 1)
    val zpopmaxCommand = RedisCommandDetails("zpopmax", -2, arrayListOf("write", "fast"), 1, 1, 1)
    val zpopminCommand = RedisCommandDetails("zpopmin", -2, arrayListOf("write", "fast"), 1, 1, 1)
    val zrandmemberCommand = RedisCommandDetails("zrandmember", -2, arrayListOf("readonly", "random"), 1, 1, 1)
    val zcountCommand = RedisCommandDetails("zcount", 4, arrayListOf("readonly", "fast"), 1, 1, 1)
    val zlexcountCommand = RedisCommandDetails("zlexcount", 4, arrayListOf("readonly", "fast"), 1, 1, 1)
    val zremrangebyscoreCommand = RedisCommandDetails("zremrangebyscore", 4, arrayListOf("write"), 1, 1, 1)
    val zremrangebyrankCommand = RedisCommandDetails("zremrangebyrank", 4, arrayListOf("write"), 1, 1, 1)
    val zremrangebylexCommand = RedisCommandDetails("zremrangebylex", 4, arrayListOf("write"), 1, 1, 1)
    val zrangeCommand = RedisCommandDetails("zrange", -4, arrayListOf("readonly"), 1, 1, 1)
    val zrangestoreCommand = RedisCommandDetails("zrangestore", -5, arrayListOf("write", "denyoom"), 1, 2, 1)
    val zrevrangeCommand = RedisCommandDetails("zrevrange", -4, arrayListOf("readonly"), 1, 1, 1)
    val zrangebyscoreCommand = RedisCommandDetails("zrangebyscore", -4, arrayListOf("readonly"), 1, 1, 1)
    val zrevrangebyscoreCommand = RedisCommandDetails("zrevrangebyscore", -4, arrayListOf("readonly"), 1, 1, 1)
    val zrangebylexCommand = RedisCommandDetails("zrangebylex", -4, arrayListOf("readonly"), 1, 1, 1)
    val zrevrangebylexCommand = RedisCommandDetails("zrevrangebylex", -4, arrayListOf("readonly"), 1, 1, 1)

    val scanCommand = RedisCommandDetails("scan", -2, arrayListOf("readonly", "random"), 0, 0, 0)
    val hscanCommand = RedisCommandDetails("hscan", -3, arrayListOf("readonly", "random"), 1, 1, 1)
    val sscanCommand = RedisCommandDetails("sscan", -3, arrayListOf("readonly", "random"), 1, 1, 1)
    val zscanCommand = RedisCommandDetails("zscan", -3, arrayListOf("readonly", "random"), 1, 1, 1)

    val flushdbCommand = RedisCommandDetails("flushdb", -1, arrayListOf("write"), 0, 0, 0)
    val flushallCommand = RedisCommandDetails("flushall", -1, arrayListOf("write"), 0, 0, 0)
    val dbsizeCommand = RedisCommandDetails("dbsize", 1, arrayListOf("readonly", "fast"), 0, 0, 0)

    val pingCommand = RedisCommandDetails("ping", -1, arrayListOf("stale", "fast"), 0, 0, 0)
    val echoCommand = RedisCommandDetails("echo", 2, arrayListOf("fast"), 0, 0, 0)
    val lolwutCommand = RedisCommandDetails("lolwut", -1, arrayListOf("readonly", "fast"), 0, 0, 0)
    val timeCommand = RedisCommandDetails("time", 1, arrayListOf("random", "loading", "stale", "fast"), 0, 0, 0)
    val resetCommand = RedisCommandDetails("reset", 1, arrayListOf("noscript", "loading", "stale", "fast"), 0, 0, 0)
    val saveCommand = RedisCommandDetails("save", 1, arrayListOf("admin", "noscript"), 0, 0, 0)
    val bgsaveCommand = RedisCommandDetails("bgsave", -1, arrayListOf("admin", "noscript"), 0, 0, 0)
    val commandCommand = RedisCommandDetails("command", -1, arrayListOf("random", "loading", "stale"), 0, 0, 0)

    val authCommand = RedisCommandDetails(
        "auth",
        -2,
        arrayListOf("noscript", "loading", "stale", "skip_monitor", "skip_slowlog", "fast", "no_auth"),
        0,
        0,
        0
    )

    val multiCommand = RedisCommandDetails(
        "multi",
        1,
        arrayListOf("noscript", "loading", "stale", "fast"),
        0,
        0,
        0
    )

    val discardCommand = RedisCommandDetails(
        "discard",
        1,
        arrayListOf("noscript", "loading", "stale", "fast"),
        0,
        0,
        0
    )

    val execCommand = RedisCommandDetails(
        "exec",
        1,
        arrayListOf("noscript", "loading", "stale", "skip_monitor", "skip_slowlog"),
        0,
        0,
        0
    )

}
