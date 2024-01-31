package patterns.structurals

open class NewsArticle(val title: String, val description: String)

data class NewsArticleWithDate(
    val article: NewsArticle,
    val date: String
) : NewsArticle(article.title + " - $date", article.description)

data class NewsArticleWithSource(
    val article: NewsArticle,
    val source: String
) : NewsArticle(article.title, article.description + " - $source")

fun main() {
    val newsArticle = NewsArticle("Article 1", "This is the description")
    val newsArticleWithDate = NewsArticleWithDate(newsArticle, "Wednesday, Jan 31")
    val newsArticleWithSource = NewsArticleWithSource(newsArticle, "Norma")

    println("The title is ${newsArticleWithDate.title}")
    println("The desc is = ${newsArticleWithSource.description}")
}
