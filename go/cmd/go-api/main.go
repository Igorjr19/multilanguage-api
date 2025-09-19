package main

import (
	"net/http"

	"github.com/gin-gonic/gin"
)

func helloWorld(c *gin.Context) {
    c.String(http.StatusOK, "Hello, World!")
}

func main() {
    router := gin.Default()
    router.GET("/", helloWorld)

    router.Run("localhost:8080")
}