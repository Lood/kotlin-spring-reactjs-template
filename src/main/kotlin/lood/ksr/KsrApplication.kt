package lood.ksr

import lood.ksr.domain.CoffeeShopModel
import lood.ksr.repository.CoffeeShopRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KsrApplication{
    @Bean
    fun run(repo: CoffeeShopRepository) = ApplicationRunner{
        repo.save(CoffeeShopModel(
            name = "Oblique",
            address = "3039 SE Stark St, Portland, OR 97214",
            phone = "555-111-4444",
            priceOfCoffee = 1.50,
            powerAccessible = true,
            internetReliability = 5
        ))
        repo.save(CoffeeShopModel(
            name = "Epoch Coffee",
            address = "221 W N Loop Blvd, Austin, TX 78751",
            phone = "555-111-2424",
            priceOfCoffee = 2.50,
            powerAccessible = true,
            internetReliability = 3
        ))
    }
}

fun main(args: Array<String>) {
    runApplication<KsrApplication>(*args)
}
