const lightCodeTheme = require('prism-react-renderer/themes/github');
const darkCodeTheme = require('prism-react-renderer/themes/dracula');

/** @type {import('@docusaurus/types').DocusaurusConfig} */
module.exports = {
  title: 'Skyhook',
  tagline: 'Skyhook is a Redis API compatible gateway to Aerospike Database',
  url: 'https://aerospike.github.io/',
  baseUrl: '/skyhook/',
  onBrokenLinks: 'throw',
  onBrokenMarkdownLinks: 'throw',
  // Recommendation is to have this true but build fails if it is 
  // trailingSlash: true,
  favicon: 'img/favicon.ico',
  organizationName: 'aerospike', // Usually your GitHub org/user name.
  projectName: 'skyhook', // Usually your repo name.
  themeConfig: {
    colorMode: {
      defaultMode: 'light',
      disableSwitch: true,
    },
    navbar: {
      title: 'Skyhook',
      logo: {
        alt: 'Skyhook',
        src: 'img/logo.png',
      },
      items: [
        // {
        //   type: 'doc',
        //   docId: 'intro',
        //   position: 'left',
        //   label: 'Docs',
        // },
        { to: '/blog', label: 'Blog', position: 'left' },
        {
          href: 'https://github.com/aerospike/skyhook',
          label: 'GitHub',
          position: 'right',
        },
      ],
    },
    footer: {
      style: 'dark',
      links: [
        // {
        //   title: 'Docs',
        //   items: [
        //     {
        //       label: 'Introduction',
        //       to: '/docs/intro',
        //     },
        //   ],
        // },
        {
          title: 'Community',
          items: [
            {
              label: 'Stack Overflow',
              href: 'https://stackoverflow.com/questions/tagged/aerospike',
            },
            {
              label: 'Twitter',
              href: 'https://twitter.com/aerospikedb',
            },
          ],
        },
        {
          title: 'More',
          items: [
            {
              label: 'Blog',
              to: '/blog',
            },
            {
              label: 'GitHub',
              href: 'https://github.com/aerospike/skyhook',
            },
          ],
        },
      ],
      copyright: `Copyright © ${new Date().getFullYear()} Aerospike`,
    },
    prism: {
      theme: darkCodeTheme,
      darkTheme: darkCodeTheme,
    },
  },
  presets: [
    [
      '@docusaurus/preset-classic',
      {
        docs: {
          sidebarPath: require.resolve('./sidebars.js'),
          routeBasePath: '/',
          // Please change this to your repo.
          editUrl: 'https://github.com/aerospike/skyhook/edit/main/website/',
        },
        blog: {
          showReadingTime: true,
          blogSidebarCount: 0,
          // Please change this to your repo.
          editUrl: 'https://github.com/aerospike/skyhook/edit/main/website/blog/',
        },
        theme: {
          customCss: require.resolve('./src/css/custom.css'),
        },
      },
    ],
  ],
};
