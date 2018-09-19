package com.example.reactive.demo.repository

import com.example.reactive.demo.model.Tweet
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface TweetRepository : ReactiveMongoRepository<Tweet, String>