# react

## multi page application (MPA)

- uses multiple or different pages to render the user interface
- pros
  - simple development
  - Search Engine Optimization is already enabled
  - rendered on the server
- cons
  - dependent on constant internet connection
  - every page gets rendered completely (for every page, browser sends a request to the server and reloads the entire page)
  - feels slower than single page application
  - can not work offline
- approach: php, python, Java

## single page application (SPA)

- the web application contains only one html page (index.html) and rest of the functionality is integrated using JS
- pros
  - the application does not reload the page every time
  - the entire application gets loaded in the browser only for the first time
  - once the application gets loaded, it never reloads again
  - SPA is faster than MPA approach
  - constant internet connection is not required for the user interface
  - SPA can work offline (since the application can be cached)
- cons
  - since the entire application gets loaded for the first time only, it takes more time to load the application compared to MPA
  - SEO is not by default possible since the page gets rendered on the client side (which can be fixed by using third party libraries like NextJS)
- approach: angular, react, vuejs

## react

- is a library to develop single page application
- developed by Meta for facebook and later got open sourced in 2013
- characteristics
  - unlike the angular or vuejs (both of them are frameworks), the react is a library
  - it has less memory footprint (it requires less memory compared to angular or vuejs)
  - uses JSX (JavaScript and XML together)
  - has component-oriented architecture (everything in React is a component)
    - a react application is just a hierarchy of components
  - deployment of react application very simple
- react ecosystem
  - package manager
    - used to create react application
    - e.g. vite, create-react-app
  - global state management
    - used for mantaining and sharing the state globally in the application
    - e.g. Redux, Context, Zustand
  - calling and caching the API results
    - e.g. TanStack Query, Redux Query
  - client side routing
    - used to add mulitple pages/screens/components
    - e.g. React Router, TanStack Router

## create react application

- using CDN (content delivery network)
  - use the react cdn links in your html page to add react library

  ```javascript
    <script crossorigin src="https://unpkg.com/react@18/umd/react.development.js"></script>
    <script crossorigin src="https://unpkg.com/react-dom@18/umd/react-dom.development.js"></script>
  ```

  - react.development.js: used to add the core react functionality
  - react-dom.development.js: used create a virtual DOM

    ```javascript
    // get the object of root div tag
    const divRoot = document.getElementById('root')
    console.log(divRoot)

    // create a root for rendering the react application
    const root = ReactDOM.createRoot(divRoot)
    console.log(root)

    // create a react element
    // h1: is the type of html element to be created
    // {}: there are no options used while rendering the h1
    // '...': contents which will be rendered inside the h1 element
    const h1 = React.createElement('h1', {}, 'welcome to react application')
    console.log(h1)

    // render the react element inside the root
    root.render(h1)
    ```

  - ReactDOM.createRoot()
    - used to create a react root element
    - the root element is responsible for rendering the react components
    - parameters
      - domNode: dom element where the react application gets loaded
  - React.createElement()
    - used to create the React Elements
    - only react elements can be rendered inside the react root
    - parameters
      - element type: type of element to be created
      - options: options used for rendering the element
      - contents:
        - contents to be rendered inside the element
        - could be a string (contents of an element)
        - could be an array of child react elements

    - babel
      - it is a Javascript compiler that compiles the modern (next generation) syntax to the legacy (old) one
      - add the following cdn link to your react application
        - <script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>

- using package manager

## JSX

- combination of JavaScript and XML (html) syntax together
- by default react does not understand the jsx syntax
- rather, react depends upon a JS compiler known as babel to transform the JSX syntax to plain JS code

### interpolation

- creating a string using value(s) of variable(s)
- used to create the element contents dynamically
- interpolation with simple variable

```javascript
const firstName = 'John'
const h1 = <h1>Welcome {firstName}</h1>
```

- interpolation with an object

```javascript
const person = { firstName: 'John', lastName: 'Doe' }
const div = (
  <div>
    <h1>First Name: {peron.firstName}</h1>
    <h1>Last Name: {person['lastName']}</h1>
  </div>
)
```

- interpolation with an array of values

```javascript
const courses = ['DAC', 'DMC', 'DBDA', 'DITISS']
const container = courses.map((course) => {
  return (
    <div>
      <strong>{course}</strong>
    </div>
  )
})
```

- interpolation with array of objects

```javascript
// array of objects
const persons = [
  { name: 'person1', age: 30, address: 'pune' },
  { name: 'person2', age: 40, address: 'mumbai' },
  { name: 'person3', age: 50, address: 'karad' },
]

// create element to render the persons
const container = persons.map((person) => {
  return (
    <div>
      <div>name: {person.name}</div>
      <div>age: {person.age}</div>
      <div>address: {person['address']}</div>
      <hr />
    </div>
  )
})
```

## component

- is a reusable entity
- contains
  - data (optional)
  - business logic (optional)
  - logic to render UI using JSX (mandatory)
- types of components
  - class component (legacy)
  - functional component (modern)
